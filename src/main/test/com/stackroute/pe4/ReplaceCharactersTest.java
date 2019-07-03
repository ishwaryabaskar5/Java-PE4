package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharactersTest {

	ReplaceCharacters replaceCharacters = null;

	@Before
	public void setUp(){
		replaceCharacters = new ReplaceCharacters();
	}

	@After
	public void tearDown(){
		replaceCharacters = null;
	}

	@Test
	public void givenInputShouldReturnReplacedString(){
		String result = replaceCharacters.replaceChar("daily dry");
		assertEquals("faity fry",result);
	}

	@Test
	public void givenInputShouldReturnSameString(){
		String result = replaceCharacters.replaceChar("Java is java again java again");
		assertEquals("Java is java again java again",result);
	}

	@Test
	public void givenInputShouldReturnEmptyString(){
		String result = replaceCharacters.replaceChar("");
		assertEquals("",result);
	}

	@Test
	public void givenInputShouldReturnNull(){
		String result = replaceCharacters.replaceChar(null);
		assertNull(result);
	}

}