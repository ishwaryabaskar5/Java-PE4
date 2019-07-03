package com.stackroute.pe4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegexCheckingTest {
	
	RegexChecking regexChecking = null;
	
	@Before
	public void setUp(){
		regexChecking = new RegexChecking();
	}
	
	@After
	public void tearDown(){
		regexChecking = null;
	}
	
	@Test
	public void givenInputShouldReturnTrueForHarry(){
		boolean result = regexChecking.checkNameRegex("This is Harry");
		assertEquals(true,result);
	}
	
	@Test
	public void givenInputShouldReturnFalseForHenry(){
		boolean result = regexChecking.checkNameRegex("This is Henry.");
		assertEquals(false,result);
	}
	
	@Test
	public void givenInputShouldReturnFalseForNull(){
		boolean result = regexChecking.checkNameRegex(null);
		Assert.assertEquals(false,result);
	}
	
	@Test
	public void givenInputShouldReturnFalseForEmptyString(){
		boolean result = regexChecking.checkNameRegex("");
		Assert.assertEquals(false,result);
	}
	
}