package string.methods;

import java.util.Scanner;

// checking for empty or not
//public boolean isEmpty()//internally uses length() of String class
//check length of a string
// public int length()//internally uses coder() of String class

public class Empty_Length {

	public static void main(String[] args) {
		String s1 = " ";
		String s2 = "a";

		String s3 = new String();
		String s4 = new String(" ");
		String s5 = new String("a");
		String s6 = new String(s2);
//		String s7 = null;
		String s8 = "null";
		System.out.println(s1.isEmpty());// it checks by using length()
		System.out.println(s1.isBlank());// it checks by using indexOfnonSpaces of length
		System.out.println(s2.isEmpty());
		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank());
		System.out.println(s5.isEmpty());
		System.out.println(s6.isEmpty());
//		System.out.println(s7.isEmpty());
		System.out.println(s8.isEmpty());

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string ");
		String str = sc.nextLine();
		System.out.println("enter string ");
		System.out.println(str.isEmpty());
		System.out.println(sc.nextLine().isEmpty());
		System.out.println("========");
		String s11 = " ";
		String s12 = "abc";
		String s10 = "suresh";
		String s13 = new String();
		String s14 = new String(" ");
		String s15 = new String("abc");
		String s16 = new String(s10);
		System.out.println(s11.length());
		System.out.println(s12.length());
		System.out.println(s13.length());
		System.out.println(s14.length());
		System.out.println(s15.length());
		System.out.println(s16.length());

	}

}
