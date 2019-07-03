package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexChecking {

//	parameter: string return type: boolean
	public boolean checkNameRegex(String str){
	
//		checks for null
		if(str == null){
			return false;
		}
		String value = "";
		boolean result = false;
//		match for the pattern with the given input string
		Pattern pattern = Pattern.compile("Harry");
		Matcher matcher = pattern.matcher(str);
		result = matcher.find();
		
		return result;
	}
}
