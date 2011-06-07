package com.buildndeploy.piglatin;

import java.util.ArrayList;
import java.util.List;

public class SentenceUtil {

	public static List<String> toList(String sentence) {
		boolean collectingWord = true;
		List<String> pieces = new ArrayList<String>();
		StringBuffer collectingString = new StringBuffer();
		Character currentCharacter;
		
		for (int i = 0; i < sentence.length(); i++) {
			currentCharacter = sentence.charAt(i);

			if (Character.isLetter(currentCharacter)) {
				if (collectingWord == true) {
					collectingString.append(currentCharacter);

				} else {
					pieces.add(collectingString.toString());
					collectingWord = !collectingWord;
					collectingString = new StringBuffer();
					collectingString.append(currentCharacter);

				}
			} else {
				if (collectingWord == false) {
					collectingString.append(currentCharacter);

				} else {
					pieces.add(collectingString.toString());
					collectingWord = !collectingWord;
					collectingString = new StringBuffer();
					collectingString.append(currentCharacter);

				}
			}
			
		}
		pieces.add(collectingString.toString());

		return pieces;
	}

}
