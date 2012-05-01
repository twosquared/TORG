package torg.client;

import java.util.ArrayList;
import java.util.Scanner;

import torg.actions.Action;
import torg.actions.BlankAction;
import torg.actions.Examine;

public class Client {

	static ArrayList<Action> actions;

	public static void main(String[] args) {
		actions = new ArrayList<Action>();
		actions.add(new Examine());

		System.out.println("--------");
		System.out.println("- TORG -");
		System.out.println("--------");

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] words = line.split("\\s+");
			Action currentAction = new BlankAction();
			for (String word : words) {
				word = word.toLowerCase();
				for (Action action : actions) {
					if (word.equals(action.getKeyword())) {
						currentAction = action;
					}
				}
			}

			System.out.println(currentAction.performAction());
		}
	}

}
