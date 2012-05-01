package torg.actions;

public class BlankAction implements Action {

	@Override
	public String getKeyword() {
		return null;
	}

	@Override
	public String performAction() {
		return "I don\'t know how to do that.";
	}

}
