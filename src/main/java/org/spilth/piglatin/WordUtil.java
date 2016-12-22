package org.spilth.piglatin;

public final class WordUtil {
	
	private static final String VOWELS = "AEIOUYaeiouy";

	private WordUtil() {};

	/**
	 * Capitalizes the given word
	 * @param word The word to be capitalized
	 * @return Capitalized version of the given word
	 */
	public static String capitalize(String word) {
		return Character.toUpperCase(word.charAt(0)) + word.substring(1);
	}

    /**
     * Determines if a word is capitalized or not
     * @param word The word to check
     * @return True if the word is capitalized. False if not.
     */
	public static boolean isCapitalized(String word) {
		return Character.isUpperCase(word.charAt(0));
	}

    /**
     * Determine if a word starts with a vowel or not
     * @param word The word to check
     * @return True if the word starts with a vowel. False if not.
     */
	public static boolean startsWithVowel(String word) {
		return isVowel(word.charAt(0));
	}

    /**
     * Determined if a character is a vowel or not
     * @param letter The character to check
     * @return True if the character is a vowel. False if not.
     */
	public static boolean isVowel(Character letter) {
		return WordUtil.VOWELS.indexOf(letter) > -1;
	}

    /**
     * Returns the index of the first vowel in a word.
     * @param word The word to check
     * @return If a vowel exists in the word, the index of the vowel. -1 if no vowel is found.
     */
	public static int getIndexOfFirstVowel(String word) {
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

    /**
     * Determines if the given string is a word or not
     * @param piece The string to check
     * @return True if the string only contains letters and an optional apostrophe.
     */
	public static boolean isWord(String piece) {
		boolean isWord = true;
		for (int i = 0; i < piece.length(); i++) {
			if (!isValidWordCharacter(piece.charAt(i))) {
				isWord = false;
				break;
			}
		}
		
		return isWord;
	}

    /**
     * Determins if a character is a valid word character
     * @param character The character to check
     * @return True if a letter or apostrophe. False if not.
     */
	public static boolean isValidWordCharacter(char character) {
		return Character.isLetter(character) || character == '\'';
	}
}
