package com.practice.topics.designPatterns.flyweight.improved;

import java.util.ArrayList;
import java.util.List;

public class WordProcessor {
	private List<Letter> letters = new ArrayList<Letter>();
	
	public void addLetter(Letter letter) {
		this.letters.add(letter);
	}

	public void printLetters() {
		letters.forEach(lett->System.out.print(lett.getValue()));
	}
}
