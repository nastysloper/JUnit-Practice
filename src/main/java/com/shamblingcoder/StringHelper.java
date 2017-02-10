package com.shamblingcoder;

public class StringHelper {

	public String removeAnyA(String string) {
		StringBuilder sb = new StringBuilder();
		for (char letter : string.toCharArray()) {
			if (letter != 'a' && letter != 'A') {
				sb.append(letter);	
			}
		}
		return sb.toString();
	}

}