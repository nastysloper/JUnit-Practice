package com.shamblingcoder;

/**
 * fail("method not implemented");
 * 
 * assertEquals(expected, actual);
 */

import static org.junit.Assert.*;

import org.junit.Test;

import com.shamblingcoder.StringHelper;

public class StringHelperTest {

	@Test
	public void removeAFromBeginning() {
		StringHelper helper = new StringHelper();
		String actual = helper.removeAnyA("AACD");
		assertEquals("CD", actual);
	}
	
	@Test
	public void removeAFromEnd() {
		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.removeAnyA("CDA"));
	}
	
	@Test
	public void removeOneA() {
		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.removeAnyA("ACD"));
	}

	@Test
	public void removeOnlyA() {
		StringHelper helper = new StringHelper();
		assertEquals("", helper.removeAnyA("A"));
	}
	
	@Test
	public void removeSumAs() {
		StringHelper helper = new StringHelper();
		assertEquals("", helper.removeAnyA("AA"));
	}
}
