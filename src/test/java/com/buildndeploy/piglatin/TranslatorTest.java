package com.buildndeploy.piglatin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TranslatorTest {
	
	Translator translator = new Translator();
		
	@Test
	public void wordStartsWithSingleConsanant() {
		assertEquals("avajay", translator.translateWord("java"));
		assertEquals("Avenmay", translator.translateWord("Maven"));
	}

	@Test
	public void wordStartsWithVowel() {
		assertEquals("appleway", translator.translateWord("apple"));
		assertEquals("Archivaway", translator.translateWord("Archiva"));
		assertEquals("Anway", translator.translateWord("An"));		
	}
	
	@Test
	public void wordStartsWithMultipleConsanants() {
		assertEquals("engthstray", translator.translateWord("strength"));
		assertEquals("Agmaticpray", translator.translateWord("Pragmatic"));
		assertEquals("ytray", translator.translateWord("try"));
	}

	@Test
	public void sentence() {
		assertEquals("Ellohay orldway", translator.toPiglatin("Hello world"));
		assertEquals("Ellohay, orldway!", translator.toPiglatin("Hello, world!"));
	}
	
}
