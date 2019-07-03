package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LetterCountTest {
	
	LetterCount letterCount = null;
	
	@Before
	public void setUp(){
		letterCount = new LetterCount();
	}
	
	@After
	public void tearDown(){
		letterCount = null;
	}
	
	@Test
	public void givenInputShouldReturnOccurrenceOfLetter(){
		int result = letterCount.findOccurrence("Java is java again java again",'a');
		assertEquals(10,result);
	}
	
	@Test
	public void givenInputShouldReturnZeroIfLetterIsNotPresent(){
		int result = letterCount.findOccurrence("Java is java again java again",'z');
		assertEquals(0,result);
	}
	
	@Test
	public void givenInputShouldReturnZeroIfStringISEmpty(){
		int result = letterCount.findOccurrence("",'z');
		assertEquals(0,result);
	}
	
	@Test
	public void givenInputShouldReturnOccurrenceOfSymbol(){
		int result = letterCount.findOccurrence("a+b=c b+c=d b=c",'=');
		assertEquals(3,result);
	}
	
	@Test
	public void givenInputShouldReturnOccurrenceOfNumericCharacter(){
		int result = letterCount.findOccurrence("947362849329",'9');
		assertEquals(3,result);
	}
	
	@Test
	public void givenInputShouldReturnZeroIfCharacterISEmpty(){
		int result = letterCount.findOccurrence("Java is java again 0java again",'\0');
		assertEquals(0,result);
	}
	
}