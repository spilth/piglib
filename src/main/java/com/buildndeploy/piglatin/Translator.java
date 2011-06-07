package com.buildndeploy.piglatin;

import java.util.ArrayList;
import java.util.List;

public class Translator {
	public String toPiglatin(String sentence) {
		List<String> pieces = new ArrayList<String>(TextUtil.toList(sentence));
		StringBuffer newSentence = new StringBuffer();
				
		for (String piece : pieces) {
			if (Character.isLetter(piece.charAt(0))) {
				newSentence.append(translateWord(piece));
			} else {
				newSentence.append(piece);
			}
		}
		
		return newSentence.toString();
	}

	protected String translateWord(String word) {
		return (WordUtil.startsWithVowel(word)) ? addWay(word) : swapAndAddWay(word);
	}

	private String swapAndAddWay(String word) {
		int firstVowelIndex = WordUtil.getIndexOfFirstVowel(word);

		String piglatinStart = word.substring(firstVowelIndex);
		String piglatinEnd = word.substring(0, firstVowelIndex).toLowerCase();
		String piglatinWord = piglatinStart + piglatinEnd + "ay";

		if (WordUtil.isCapitalized(word)) {
			piglatinWord = WordUtil.capitalize(piglatinWord);
		}

		return piglatinWord;
	}

	private String addWay(String word) {
		return word + "way";
	}
}
