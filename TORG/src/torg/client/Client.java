package torg.client;

import java.util.ArrayList;
import java.util.Scanner;

import torg.Synonym;
import torg.actions.Action;
import torg.actions.BlankAction;
import torg.actions.Examine;
import torg.actions.PickUp;
import torg.entities.Entity;
import torg.entities.Table;

public class Client {

	static ArrayList<Action> actions;
	static ArrayList<Entity> entities;
	static ArrayList<Synonym> synonyms;

	public static void main(String[] args) {
		actions = new ArrayList<Action>();
		actions.add(new Examine());
		actions.add(new PickUp());

		entities = new ArrayList<Entity>();
		entities.add(new Table());

		synonyms = new ArrayList<Synonym>();
		synonyms.add(new Synonym("examine", "look at"));
		synonyms.add(new Synonym("lift", "pick up"));

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] words = line.split("\\s+");

			Action action = new BlankAction();
			Entity entity = null;

			for (String word : words) {
				word = word.toLowerCase();

				out: for (Synonym s : synonyms) {
					for (String sy : s.alternatives) {
						if (s.equals(sy)) {
							word = sy;
							break out;
						}
					}
				}

				for (Action a : actions) {
					if (word.equals(a.getKeyword())) {
						action = a;
						break;
					}
				}

				for (Entity e : entities) {
					if (word.equals(e.getName())) {
						entity = e;
						break;
					}
				}
			}

			if (action.getKeyword() != null && entity != null) {
				System.out.println(entity.performAction(action));
			} else {
				System.out.println(action.performAction());
			}
		}
	}

}
