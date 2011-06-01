package com.buildndeploy.piglatin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TranslatorTest {
	
	@Test
	public void startsWithSingleConsanant() {
		Translator translator = new Translator();
		assertEquals("avajay", translator.toPiglatin("java"));
		assertEquals("Avenmay", translator.toPiglatin("Maven"));
	}

	@Test
	public void startsWithVowel() {
		Translator translator = new Translator();
		assertEquals("appleway", translator.toPiglatin("apple"));
		assertEquals("Archivaway", translator.toPiglatin("Archiva"));
		assertEquals("Anway", translator.toPiglatin("An"));		
	}
	
	@Test
	public void startsWithMultipleConsanants() {
		Translator translator = new Translator();
		assertEquals("engthstray", translator.toPiglatin("strength"));
		assertEquals("Agmaticpray", translator.toPiglatin("Pragmatic"));
		assertEquals("ytray", translator.toPiglatin("try"));
	}

}
