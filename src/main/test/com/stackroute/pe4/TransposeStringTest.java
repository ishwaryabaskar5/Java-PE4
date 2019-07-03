package com.stackroute.pe4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
	
	TransposeString transposeString = null;
	
	@Before
	public void setUp(){
		transposeString = new TransposeString();
	}
	
	@After
	public void tearDown(){
		transposeString = null;
	}
	
	@Test
	public void givenInputShouldReturnTransposedString(){
		String actulResult = transposeString.transpose("a quick brown fox jumps over the lazy dog");
		String expectedResult = "a kciuq nworb xof spmuj revo eht yzal god";
		assertEquals(expectedResult,actulResult);
	}
	
	@Test
	public void givenInputShouldReturnNull(){
		String actulResult = transposeString.transpose(null);
		assertNull(actulResult);
	}
	
	@Test
	public void givenInputShouldReturnEmptyString(){
		String actulResult = transposeString.transpose("");
		Assert.assertEquals("",actulResult);
	}
}