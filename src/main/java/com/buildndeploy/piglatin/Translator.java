package com.buildndeploy.piglatin;

public class Translator {
	public String toPiglatin(String originalWord) {
		if (WordUtil.startsWithVowel(originalWord)) {
			return (addWay(originalWord));
		} else {
			return (swapAndAddWay(originalWord));
		}
	}

	private String swapAndAddWay(String originalWord) {
		int firstVowelIndex = WordUtil.getIndexOfFirstVowel(originalWord);

		String piglatinStart = originalWord.substring(firstVowelIndex);
		String piglatinEnd = originalWord.substring(0, firstVowelIndex).toLowerCase();
		String piglatinWord = piglatinStart + piglatinEnd + "ay";

		if (WordUtil.isCapitalized(originalWord)) {
			piglatinWord = WordUtil.capitalize(piglatinWord);
		}

		return piglatinWord;
	}

	private String addWay(String originalWord) {
		return originalWord + "way";
	}
}
