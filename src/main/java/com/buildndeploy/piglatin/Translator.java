package com.buildndeploy.piglatin;

public class Translator {
	public String toPiglatin(String sentence) {
		String[] words = sentence.split(" ");
		StringBuffer newSentence = new StringBuffer();
				
		for (String word : words) {
			newSentence.append(translateWord(word));
			newSentence.append(" ");
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
