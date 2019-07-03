package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PatternOccurrenceTest {
	
	PatternOccurrence patternOccurrence = null;
	
	@Before
	public void setUp(){
		patternOccurrence = new PatternOccurrence();
	}
	
	@After
	public void tearDown(){
		patternOccurrence = null;
	}
	
	@Test
	public void givenInputShouldReturnIndexOfPattern(){
		String  actulResult= patternOccurrence.findIndex("She sells seashells by the seashore","se");
		String expectedResult = "Found at: 4 - 6\nFound at: 10 - 12\nFound at: 27 - 29";
		assertEquals(expectedResult,actulResult);
	}
	
	@Test
	public void givenInputShouldReturnWordNotFoundErrorMessage(){
		String  actulResult= patternOccurrence.findIndex("She sells seashells by the seashore","ze");
		String expectedResult = "Given word is not found in the given string";
		assertEquals(expectedResult,actulResult);
	}
	
	@Test
	public void givenInputShouldReturnErrorMessageWhileInputEmptyString(){
		String actulResult = patternOccurrence.findIndex("She sells seashells by the seashore","");
		String expectedResult="Please enter valid string and regex. Note: It should not be empty and null";
		assertEquals(expectedResult,actulResult);
	}
	
	@Test
	public void givenInputShouldReturnErrorMessageWhileInputNull(){
		String actulResult = patternOccurrence.findIndex("She sells seashells by the seashore",null);
		String expectedResult="Please enter valid string and regex. Note: It should not be empty and null";
		assertEquals(expectedResult,actulResult);
	}
	
}