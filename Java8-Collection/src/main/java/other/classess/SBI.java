package other.classess;

public class SBI implements Bank {

	private double balance = 10000;
	private double withdrawbal;

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawbal() {
		return withdrawbal;
	}

	public void setWithdrawbal(double withdrawbal) {
		this.withdrawbal = withdrawbal;
	}

	public void deposit(double amount) throws InsufficientFundsException, InvalidAmountException {
		if (amount >= 100) {
			double availBal = amount + getBalance();
			double newBal = getBalance() + amount;
			setBalance(newBal);
			System.out.println("available balance is :" + availBal);
		} else {
			throw new InsufficientFundsException(getBalance() + " you've enterd morethan whatever you've");
		}
	}

	public double withdraw(double amount) throws InvalidAmountException {
		if (amount <= getBalance()) {
			double newBal = getBalance() - amount;
			System.out.println("your avalable balance is :" + newBal);
			setBalance(newBal);
		} else {
			throw new InvalidAmountException(amount + " you've entered invalid amount");
		}
		return amount;
	}

	public void balEnquiry() {
		double amount = getBalance();
		System.out.println("your Account blance is :" + getBalance());
	}

}
