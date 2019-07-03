package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortParagraphTest {
	SortParagraph sortParagraph = null;
	
	@Before
	public void setUp(){
		sortParagraph = new SortParagraph();
	}
	
	@After
	public void tearDown(){
		sortParagraph = null;
	}
	
	@Test
	public void givenInputShouldReturnSortedParagraph(){
		String[]  actulResult= sortParagraph.sortWordsInParagraph("This class implements the CharSequence interface");
		String[] expectedResult ={"CharSequence","class","implements","interface","the","This"};
		assertArrayEquals(expectedResult,actulResult);
	}
	
	@Test
	public void givenInputShouldReturnSortedParagraphWhichContainRepeatedWords(){
		String[] actulResult = sortParagraph.sortWordsInParagraph("Java is java again java again");
		String[] expectedResult ={"again","again","is","Java","java","java"};
		assertArrayEquals(expectedResult,actulResult);
	}
	
	@Test
	public void givenInputShouldReturnEmptyString(){
		String[] actulResult = sortParagraph.sortWordsInParagraph("");
		String[] expectedResult={""};
		assertArrayEquals(expectedResult,actulResult);
	}
	
	@Test
	public void givenInputShouldReturnNull(){
		String[] actulResult = sortParagraph.sortWordsInParagraph(null);
		assertNull(actulResult);
	}
}