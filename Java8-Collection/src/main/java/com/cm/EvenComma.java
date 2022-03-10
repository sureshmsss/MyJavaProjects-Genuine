package com.cm;

public class EvenComma {
	private void printEvenNo(int i1) {
		for (int i = 0; i <= i1; i++) {
			if (i % 2 == 0) {
				System.out.print(i);
				if (i != i1) {
					System.out.print(",");
				}
			}
		}
	}

	public static void main(String[] args) {
		EvenComma printeven = new EvenComma();
		System.out.println();
		printeven.printEvenNo(10);
	}

}
