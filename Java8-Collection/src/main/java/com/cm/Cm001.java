package com.cm;

public class Cm001 {

	public static void main(String[] args) {
		String s = "abcd";
		long l1, l2;
		l1 = System.currentTimeMillis();
		l2 = System.currentTimeMillis();
		StringBuffer sb1 = new StringBuffer(s);
		StringBuffer sb2 = sb1.reverse();
		String s1 = sb2.toString();
		System.out.println("time : " + (l2 - l1));
		System.out.println(s1);
	}

}
