package torg;

import java.util.ArrayList;

public class Synonym {

	public String word;
	public ArrayList<String> alternatives;

	public Synonym(String word) {
		this.word = word;
		alternatives = new ArrayList<String>();
	}

	public Synonym(String word, String... synonyms) {
		this(word);
		for (String synonym : synonyms) {
			alternatives.add(synonym);
		}
	}

}
