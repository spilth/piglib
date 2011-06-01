package com.buildndeploy.piglatin;

public class Translator {
	private static final String VOWELS = "AEIOUYaeiouy";

	public String toPiglatin(String originalWord) {
		if (startsWithVowel(originalWord)) {
			return (simplePiglatinWord(originalWord));
		} else {
			return (complexPiglatinWord(originalWord));
		}
	}

	private String complexPiglatinWord(String originalWord) {
		int firstVowelIndex = findFirstVowelIndex(originalWord);

		String piglatinStart = originalWord.substring(firstVowelIndex);
		String piglatinEnd = originalWord.substring(0, firstVowelIndex).toLowerCase();
		String piglatinWord = piglatinStart + piglatinEnd + "ay";

		if (isCapitalized(originalWord)) {
			piglatinWord = StringUtil.capitalizeWord(piglatinWord);
		}

		return piglatinWord;
	}

	private boolean isCapitalized(String originalWord) {
		return Character.isUpperCase(originalWord.charAt(0));
	}

	private String simplePiglatinWord(String originalWord) {
		return originalWord + "way";
	}

	private boolean startsWithVowel(String word) {
		return isVowel(word.charAt(0));
	}

	private int findFirstVowelIndex(String word) {
		int wordLength = word.length();

		for (int i = 0; i < wordLength; i++) {
			if (isVowel(word.charAt(i))) {
				return i;
			}
		}

		return 0;
	}

	private boolean isVowel(Character letter) {
		return VOWELS.indexOf(letter) > -1;
	}

}
