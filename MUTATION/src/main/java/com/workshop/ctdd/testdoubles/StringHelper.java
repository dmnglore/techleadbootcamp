package com.workshop.ctdd.testdoubles;

public class StringHelper {

	public String swapLast2Chars(String str) {
		// TODO Auto-generated method stub
		
		int strLength = str.length();
		if (strLength <2)
			return str;
		String restOfString = str.substring(0, strLength -2);
	char lastChar = str.charAt(strLength - 1);
	char secLastChar = str.charAt(strLength - 2);
	return restOfString+lastChar+secLastChar;

	}
}
