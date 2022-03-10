package com.cm;

import java.util.Stack;

public class CM02 {
	@Override
	public String toString() {
		return super.toString();
	}

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();

		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		System.out.println("s1  : " + s1);
		for (int i = s1.capacity(); i < s1.capacity() - 1; i--) {
			s2.push(s1.get(i));
			System.out.println("i : " + i);
		}
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
	}
}
