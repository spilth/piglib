package org.spilth.piglatin;

import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

public class Translator {

	/**
	 * Converts a sentence into its piglatin equivalent
	 * @param sentence The sentence to translate
	 * @return The pigtalin version of the given sentence
	 */
	public String toPiglatin(String sentence) {
		List<String> pieces = SentenceUtil.toList(sentence);
		StringBuffer newSentence = new StringBuffer();
				
		for (String piece : pieces) {
			newSentence.append(WordUtil.isWord(piece) ? translateWord(piece) : piece);
		}
		
		return newSentence.toString();
	}

	public String translateWord(String word) {
		if ("".equals(word)) return "";
		return (WordUtil.startsWithVowel(word)) ? addWay(word) : swapAndAddWay(word);
	}

	private String swapAndAddWay(String word) {
		int firstVowelIndex = WordUtil.getIndexOfFirstVowel(word);

		if(firstVowelIndex == -1) {
			return word + "ay";
		}
		String piglatinStart = word.substring(firstVowelIndex);
		
		boolean allUpper = StringUtils.isAllUpperCase(word);
		String piglatinEnd = null;
		if(allUpper) {
			piglatinEnd = word.substring(0, firstVowelIndex);
		}
		else {
			piglatinEnd = word.substring(0, firstVowelIndex).toLowerCase(Locale.ENGLISH);
		}
				
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