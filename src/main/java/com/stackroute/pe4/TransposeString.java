package com.stackroute.pe4;

//Find the transpose of given string
public class TransposeString {

//	parameter: string return type: string
	public String transpose(String str){
	
//		checks for null
		if(str == null){
			return null;
		}
		
//		declaration and initialization
		StringBuffer stringBuffer = new StringBuffer();
		String transposeStr = "";
		String[] word =  str.split(" ");

		for(String s:word){
		
//			convert a string into string buffer by append
			stringBuffer.append(s);
			
//			reverse string
			stringBuffer.reverse();
			
//			concatenate the reversed string
			transposeStr += stringBuffer+" ";
			
//			make the string buffer empty
			stringBuffer.delete(0,(stringBuffer.length()));
		}
		
		return transposeStr.trim();
	}
}
