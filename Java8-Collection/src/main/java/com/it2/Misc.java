package com.it2;

import java.util.HashMap;

class Str {
	String s1 = "KIRANKUMAR";

	@Override
	public boolean equals(Object obj) {
		
		return false;
	}
}

public class Misc {
	// static String s1="KIRAN";

	public static void main(String[] args) {
		HashMap<Object, Object> hm = new HashMap<>();
		// for(int i=0;i<s1.length();i++){
		// hm.put(s1.charAt(i), 1);
		// }
		
		System.out.println("\n " + hm);
	}

}
