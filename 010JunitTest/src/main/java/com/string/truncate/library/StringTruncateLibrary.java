package com.string.truncate.library;

public class StringTruncateLibrary {
	
	// AAAA => AA, ABCD => BCD , BACD => BCD
	public String truncateFirstTwoA(String str) {
		
			if(str.length() <= 2) {
				return str.replaceAll("A", "");
			}
			
		String firstTwoCharacters = str.substring(0, 2);
		String stringExludingFirstTwoCharacters = str.substring(2);
		
		return firstTwoCharacters.replaceAll("A", "") + stringExludingFirstTwoCharacters;
		
		
	}
	
}
