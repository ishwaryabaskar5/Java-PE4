package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternOccurrence {
	
	//This will return the p
	public String findIndex(String str, String regex){
	
//		checks for null and empty string
		if(str == null || regex == null || str == "" || regex == ""){
			return "Please enter valid string and regex. Note: It should not be empty and null";
		}
		
//		declaration and initialization
		String result = "";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);

//		Finds the start and end index of the regex in string
		while (matcher.find()) {
			result = result + "Found at: " + matcher.start() + " - " + matcher.end() + "\n";
		}

		if(result == "")
		{
			return "Given word is not found in the given string";
		}
		return result.trim();
	}
}
