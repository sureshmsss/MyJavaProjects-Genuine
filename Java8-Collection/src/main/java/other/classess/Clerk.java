package other.classess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clerk {

	public static void main(String[] args) {
		try {
			Bank ac1 = new SBI();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String option = " ";

			do {
				try {
					System.out.println("chosse option");
					System.out.println("1.diposit");
					System.out.println("2.withdraw");
					System.out.println("3.balEnquiry");
					System.out.println("enter option");
					option = br.readLine();
					switch (option) {

					case "1": {
						System.out.println("enter deposit amount");
						String s = br.readLine();
						double amount = Double.parseDouble(s);

						ac1.deposit(amount);
						ac1.balEnquiry();

						break;
					}
					case "2": {
						System.out.println("enter withdraw amount");
						String s = br.readLine();
						double amt = Double.parseDouble(s);

						double withdrawAmt = ac1.withdraw(amt);
						System.out.println("withdrawn amount is " + amt);
						ac1.balEnquiry();
						break;
					}
					case "3": {
						ac1.balEnquiry();
						break;
					}
					default:
						System.out.println("invalid option");
					}
				} // innertry
				catch (InvalidAmountException e) {
					System.out.println("invalid amont " + e);
				} catch (InsufficientFundsException e) {
					System.out.println("insuffiient funds " + e);
				} catch (NumberFormatException e) {
					System.out.println(e);
				}
				System.out.println("\n do u wnat to ask");
				option = br.readLine();
			} while (option.equalsIgnoreCase("yes"));
			System.out.println("thank you,visit again");
		} // outer try
		catch (IOException e) {
			System.out.println("from out try :" + e);
		}//catch
	}// main
}// class
