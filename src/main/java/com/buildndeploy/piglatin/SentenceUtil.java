package com.buildndeploy.piglatin;

import java.util.ArrayList;
import java.util.List;

public class SentenceUtil {

	public static List<String> toList(String sentence) {
		List<String> pieces = new ArrayList<String>();
		StringBuffer collectedString = new StringBuffer();
		boolean isCollectingWord = Character.isLetter(sentence.charAt(0));
		
		for (char character : sentence.toCharArray()) {
			if (switchingCollectionMode(isCollectingWord, character)) {
				pieces.add(collectedString.toString());
				collectedString = new StringBuffer();
				isCollectingWord = !isCollectingWord;
			}

			collectedString.append(character);
		}

		pieces.add(collectedString.toString());

		return pieces;
	}

	private static boolean switchingCollectionMode(boolean collectingWord, char character) {
		return (switchingToWord(collectingWord, character))
		|| (switchingToNonWord(collectingWord, character));
	}

	private static boolean switchingToNonWord(boolean collectingWord, char character) {
		return !WordUtil.isValidWordCharacter(character) && collectingWord == true;
	}

	private static boolean switchingToWord(boolean collectingWord, char character) {
		return WordUtil.isValidWordCharacter(character) && collectingWord == false;
	}

}
