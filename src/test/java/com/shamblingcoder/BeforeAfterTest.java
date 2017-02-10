package com.shamblingcoder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAfterTest {

	@BeforeClass
	public static void doBeforeClass() {
		System.out.println("Doin it at the beginning!");
	}
	
	@AfterClass
	public static void doAfterClass() {
		System.out.println("Doin it after the class!");
	}
	
	@Before
	public void doBefore() {
		System.out.println("Setting up before the method!");
	}
	
	@After
	public void doAfter() {
		System.out.println("Cleaning up following test!");
	}
	
	@Test
	public void doTest() {
		System.out.println("Running the test!");
	}
}
