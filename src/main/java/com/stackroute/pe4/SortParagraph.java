package com.stackroute.pe4;

// Sort the words in paragraph
public class SortParagraph {

//	parameter: string(paragraph) return type: string[](sorted list of words)
	public String[] sortWordsInParagraph(String paragraph){
	
//		checks for null
		if(paragraph == null){
			return null;
		}
		
//		Split the paragraph into array of words
		String[] words = paragraph.split(" ");
		String temp;
		
//		compares the string and swaps the string if
		for (int i=0;i<words.length-1;i++){
			for (int j=i+1;j<words.length;j++){
				if (words[i].compareToIgnoreCase(words[j])>0){
					temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		
		return words;
	}
}
