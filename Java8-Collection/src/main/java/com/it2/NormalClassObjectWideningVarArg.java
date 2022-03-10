package com.it2;

class Exam {
}// extends Object{}

class Exam1 extends Exam {
/*	void m1(Exam1[] e) {
		System.out.println("Exam1[] m1()");
	}

	void m1(Exam[] e) {
		System.out.println("Exam[] m1()");
	}

	void m1(Exam1[]... e) {
		System.out.println("Exam1[]... m1()");
	}

	void m1(Exam[]... e) {
		System.out.println("Exam[]... m1()");
	}

	void m1(Object... e) {
		System.out.println("Object...  m1()");
	}

	void m1(Object e) {
		System.out.println("Object m1()");
	}

	void m1(Object[]... e) {
		System.out.println("Object[]... m1()");
	}
*/
	void m1(Object[][]... e) {
		System.out.println("Object[][]... m1()");
	}

}

public class NormalClassObjectWideningVarArg {

	public static void main(String[] args) {
		Exam1 e1 = new Exam1();
		e1.m1(new Exam1[1][1]);
		System.out.println("Hello World!");
	}
}