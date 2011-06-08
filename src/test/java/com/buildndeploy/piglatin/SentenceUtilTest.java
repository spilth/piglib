package com.buildndeploy.piglatin;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SentenceUtilTest {

	@Test
	public void sentencesBecomeLists() {
		assertStringListEquals(
			"First third fifth!",
			new String[]{"First", " ", "third", " ", "fifth", "!"}
		);
	}
	
	@Test
	public void sentenceStartsWithNonWord() {
		assertStringListEquals(
			" More to go?",
			new String[] {" ", "More", " ", "to", " ", "go", "?"}
		);	
	}
	
	@Test
	public void sentenceWithContractedWord() {
		assertStringListEquals(
			"Don't panic!",
			new String[] {"Don't", " ", "panic", "!"}
		);	
	}

	private void assertStringListEquals(String sentence, String[] sentenceArray) {
		assertEquals("Lists not the same", Arrays.asList(sentenceArray), SentenceUtil.toList(sentence));
	}

}
