package com.stackroute.pe4;

//Replaces the character of string
public class ReplaceCharacters {

//	parameter: string return type: string
	public String replaceChar(String str){
	
//		checks for the string is null
		if(str == null){
			return null;
		}
		
//		replace the char 'd' with 'f' and char 'l' with 't'
		str = str.replace('d','f');
		str = str.replace('l','t');
		return str;
	}
}
