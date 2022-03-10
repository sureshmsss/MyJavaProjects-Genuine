package com.it2;

public class Var001 {

	public static void main(String[] args) {

		int i = 110;
		byte b = 120;
		
		int i1=b;
		
	byte b3=(byte)i1;

		Integer io1 = Integer.valueOf(i);// AutoBoxing
		Byte bo1 = Byte.valueOf(b);
		
		
		
		int i2 = io1.intValue();// AUB
		byte b2=bo1.byteValue();
		
		Number no1=io1;

		System.out.println("object :" + io1);
		System.out.println("primitive :" + i2);
		System.out.println("object :" + bo1);
		System.out.println("primitive :" + b2);

	}

}
