package com.buildndeploy.piglatin;

public class Translator {
	public String toPiglatin(String word) {
		if (WordUtil.startsWithVowel(word)) {
			return (addWay(word));
		} else {
			return (swapAndAddWay(word));
		}
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
