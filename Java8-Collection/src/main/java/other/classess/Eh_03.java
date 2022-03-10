package other.classess;

import java.io.PrintStream;
import java.io.PrintWriter;

public class Eh_03 {
	static int m1() {
		try {
			System.out.println("from inner try of an outer trycatch");
			System.out.println(1 / 0);
		} catch (NullPointerException e) {
			System.out.println("in catch");
		} finally {
			System.out.println("in finally");
			return 30;
		}
	}

	public static void main(String[] args) {
		try (PrintStream ps = new PrintStream(System.out);) {
			ps.println("hi");
		}
		Eh_03 e = new Eh_03();
		int x = e.m1();
		System.out.println(x);
	}
}