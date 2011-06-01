package com.buildndeploy.piglatin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordUtilTest {

	@Test
	public void wordCapitalization() {
		assertEquals("Foo", WordUtil.capitalize("foo"));
		assertEquals("BAR", WordUtil.capitalize("BAR"));
	}

	@Test
	public void isCapitalized() {
		assertTrue(WordUtil.isCapitalized("Foo"));
		assertFalse(WordUtil.isCapitalized("bar"));
	}
}
