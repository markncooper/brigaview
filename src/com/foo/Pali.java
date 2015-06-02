package com.foo;

public class Pali {
	static public boolean isPali(String str){
		
		str = str.toLowerCase();
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		
		for (int c=0; c< (str.length() / 2); c++){
			if (str.charAt(c) != str.charAt(str.length()-c-1)) return false;
		}
		
		return true;
	}
}
