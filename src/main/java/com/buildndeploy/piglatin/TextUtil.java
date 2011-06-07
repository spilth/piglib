package com.buildndeploy.piglatin;

import java.util.ArrayList;
import java.util.List;

public class TextUtil {

	public static List<String> toList(String text) {
		boolean wordMode = true;
		List<String> output = new ArrayList<String>();
		StringBuffer tempString = new StringBuffer();
		Character currentCharacter;
		
		for (int i = 0; i < text.length(); i++) {
			currentCharacter = text.charAt(i);

			if (Character.isLetter(currentCharacter)) {
				if (wordMode == true) {
					tempString.append(currentCharacter);

				} else {
					output.add(tempString.toString());
					wordMode = !wordMode;
					tempString = new StringBuffer();
					tempString.append(currentCharacter);

				}
			} else {
				if (wordMode == false) {
					tempString.append(currentCharacter);

				} else {
					output.add(tempString.toString());
					wordMode = !wordMode;
					tempString = new StringBuffer();
					tempString.append(currentCharacter);

				}
			}
			
		}
		output.add(tempString.toString());

		return output;
	}

}
