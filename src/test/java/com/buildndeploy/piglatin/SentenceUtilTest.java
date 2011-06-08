package com.buildndeploy.piglatin;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SentenceUtilTest {

	@Test
	public void sentencesBecomeLists() {
		String sentence = "First third fifth!";
		String[] sentenceArray = {"First", " ", "third", " ", "fifth", "!"};
		assertEquals("Lists not the same", Arrays.asList(sentenceArray), SentenceUtil.toList(sentence));
	}
	
	@Test
	public void sentencesStartsWithNumber() {
		String sentence = " More to go?";
		String[] sentenceArray = {" ", "More", " ", "to", " ", "go", "?"};				
		assertEquals("Lists not the same", Arrays.asList(sentenceArray), SentenceUtil.toList(sentence));
	}
	
	@Test
	public void sentenceWithContractedWord() {
		String sentence = "Don't panic!";
		String[] sentenceArray = {"Don't", " ", "panic", "!"};
		assertEquals("Lists not the same", Arrays.asList(sentenceArray), SentenceUtil.toList(sentence));
	}
}
