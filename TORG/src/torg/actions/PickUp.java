package torg.actions;

public class PickUp implements Action {

	@Override
	public String getKeyword() {
		return "lift";
	}

	@Override
	public String performAction() {
		return "What should I pick up?";
	}

}
