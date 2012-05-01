package torg.entities;

import torg.actions.Action;

public interface Entity {

	public String getName();

	public String performAction(Action action);

}
