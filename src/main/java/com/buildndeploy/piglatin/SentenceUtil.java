package com.buildndeploy.piglatin;

import java.util.ArrayList;
import java.util.List;

public class SentenceUtil {

	public static List<String> toList(String sentence) {
		boolean collectingWord = true;
		List<String> pieces = new ArrayList<String>();
		StringBuffer collectedString = new StringBuffer();
		char[] characters = sentence.toCharArray();
		
		for (char character : characters) {
			if (Character.isLetter(character)) {
				if (collectingWord == false) {
					pieces.add(collectedString.toString());
					collectingWord = !collectingWord;
					collectedString = new StringBuffer();
				}
			} else {
				if (collectingWord == true) {
					pieces.add(collectedString.toString());
					collectingWord = !collectingWord;
					collectedString = new StringBuffer();
				}
			}

			collectedString.append(character);

		}
		pieces.add(collectedString.toString());

		return pieces;
	}

}
