package com.buildndeploy.piglatin;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SentenceUtilTest {

	@Test
	public void sentencesBecomeLists() {
		String sentence = "First third fifth!";
		List<String> pieces = SentenceUtil.toList(sentence);
		List<String> expected = new ArrayList<String>(
			Arrays.asList(
				new String[ ]{"First", " ", "third", " ", "fifth", "!"}
			)
		);
				
		assertEquals("Lists not the same", expected, pieces);
	}
	
	@Test
	public void sentencesStartsWithNumber() {
		String sentence = " More to go?";
		List<String> pieces = SentenceUtil.toList(sentence);
		List<String> expected = new ArrayList<String>(
			Arrays.asList(
				new String[ ]{" ", "More", " ", "to", " ", "go", "?"}
			)
		);
				
		assertEquals("Lists not the same", expected, pieces);
	}
}
