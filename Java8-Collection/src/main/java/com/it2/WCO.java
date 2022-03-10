package com.it2;

public class WCO {
	
	long l1=46525455641l;
	
	
	byte b1=20;
	Byte bo1=b1;
	byte b2=bo1;
	
	
	
	void m1(int a){
		System.out.println("m1");
	}
	void m1(WCO w){
		System.out.println("m1");
	}

	public static void main(String[] args) {
		WCO w1=new WCO();
	//	w1.m1(12);
		w1.m1(new WCO());
		new WCO();

	}
//int a=12
	//WCO w=new WCO();
}
