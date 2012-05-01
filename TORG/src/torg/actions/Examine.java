package torg.actions;

public class Examine implements Action {

	@Override
	public String getKeyword() {
		return "examine";
	}

	@Override
	public String performAction() {
		return "What am I mean to be looking at?";
	}

}
