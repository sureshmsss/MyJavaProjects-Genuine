package other.classess;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eh001 {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("enter a no for ==a");
			int a = sc.nextInt();
			System.out.println("enter a no for ==b");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("a/b :" + c);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println("please follow the mathematicall rules");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
			System.out.println("please follow the mathematicall rules");
		} catch (ClassCastException e) {
			System.out.println("ClassCastException");
			System.out.println("please follow the mathematicall rules");
		} finally {
			System.out.println("thank you, visit again");
		}

	}

}
