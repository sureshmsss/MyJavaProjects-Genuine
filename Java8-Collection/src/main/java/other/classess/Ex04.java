package other.classess;

import java.util.Scanner;

public class Ex04 {
	static int a = 10;

	static void m1(int a) throws ArithmeticException {

		System.out.println("suresh doiong ");
		System.out.println("a value is :" + Ex04.a / a);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("hello world");
		// while (true) {
		try {
			while (true) {
				int a = sc.nextInt();
				m1(a);

			}
		}

		catch (ArithmeticException e) {
			System.out.println("pleade enter a no other than zero");
		} catch (NumberFormatException e) {
			System.out.println("please enter noumbers only");
		} finally {
			System.out.println("thanking you for visiting Ss solutions");
		}
	}

}
