package other.classess;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		if (age > 18) {
			throw new ElgibleException("yes elgible for Voting");
		} else {
			throw new NotElgibleException("you are a kid");
		}
	}
}