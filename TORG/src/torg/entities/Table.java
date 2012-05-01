package torg.entities;

import torg.actions.Action;
import torg.actions.Examine;
import torg.actions.PickUp;

public class Table implements Entity {

	@Override
	public String getName() {
		return "table";
	}

	@Override
	public String performAction(Action action) {
		if (action instanceof Examine) {
			return "It\'s just a table... Maybe the things on top of it are more interesting?";
		} else if (action instanceof PickUp) {
			return "It\'s too heavy!";
		}
		return "What?";
	}

}
