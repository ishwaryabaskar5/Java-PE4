package com.stackroute.pe4;

//Find out the occurrence of character in string
public class LetterCount {

//	parameter: string, character return type: int(occurrence)
	public int findOccurrence(String str, char ch){
		
		int num = 0;
		
//		replace the char with empty string
		String replacedStr = str.replace(""+ch,"");
		
//		calculates the difference between length of original string replaced string
		num = str.length() - replacedStr.length();
		return num;
	}
}
