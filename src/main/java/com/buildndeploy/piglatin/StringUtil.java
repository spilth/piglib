package com.buildndeploy.piglatin;

public class StringUtil {

	public static String capitalizeWord(String word) {
		return Character.toUpperCase(word.charAt(0)) + word.substring(1);
	}

}
