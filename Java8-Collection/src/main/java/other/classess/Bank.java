package other.classess;

public interface Bank {
	public double withdraw(double amount) throws InvalidAmountException;

	public void deposit(double amount) throws InsufficientFundsException, InvalidAmountException;

	public void balEnquiry();
}
