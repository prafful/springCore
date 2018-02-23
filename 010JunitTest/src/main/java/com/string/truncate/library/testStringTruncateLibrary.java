package com.string.truncate.library;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testStringTruncateLibrary {
	
	StringTruncateLibrary stringTruncateLibrary = null;
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	
	@After
	public void afterTest() {
		System.out.println("After unit test");
		stringTruncateLibrary = null;
	}
	
	
	@Before
	public void beforeTest() {
		System.out.println("Before unit test");
		stringTruncateLibrary = new StringTruncateLibrary();
	}
	
	
	@Test
	public void testTruncateFirstTwoAPositive() {
		System.out.println("Positive Truncate Unit test");
		
		String testString = "BACD";
		String actualResult = stringTruncateLibrary.truncateFirstTwoA(testString);
		String expectedResult = "BCD";
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testTruncateFirstTwoANegative() {
		System.out.println("Negative Truncate Unit test");
		//StringTruncateLibrary stringTruncateLibrary = new StringTruncateLibrary();
		String testString = "ACD";
		String actualResult = stringTruncateLibrary.truncateFirstTwoA(testString);
		String expectedResult = "BCD";
		assertEquals(expectedResult, actualResult);
	}
	
	@Test(timeout=50)
	public void generateRandomNumbers() {
		double randomNumbers[] = new double[100000];
		for(int i=0; i<100000; i++) {
			randomNumbers[i] = (double) Math.random()+1;
			//System.out.println(randomNumbers[i]);
		}
		//System.out.println(randomNumbers);
	}

}
