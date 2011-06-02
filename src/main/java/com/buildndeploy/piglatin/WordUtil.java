package com.buildndeploy.piglatin;

public final class WordUtil {
	
	private static final String VOWELS = "AEIOUYaeiouy";

	private WordUtil() {};

	public static String capitalize(String word) {
		return Character.toUpperCase(word.charAt(0)) + word.substring(1);
	}

	public static boolean isCapitalized(String word) {
		return Character.isUpperCase(word.charAt(0));
	}

	static boolean startsWithVowel(String word) {
		return isVowel(word.charAt(0));
	}

	static boolean isVowel(Character letter) {
		return WordUtil.VOWELS.indexOf(letter) > -1;
	}

	static int getIndexOfFirstVowel(String word) {
		int wordLength = word.length();
		int index = -1;
	
		for (int i = 0; i < wordLength; i++) {
			if (isVowel(word.charAt(i))) {
				index = i;
				break;
			}
		}
	
		return index;
	}

}
