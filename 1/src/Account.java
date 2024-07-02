
public class Account {
	private String accountNo;
	private double balance;
	private int deposits;
	private int withdrawals;

	public void setAccountNo(String theAccountNo) {
		accountNo = theAccountNo;
	}
	
	public String getAccountNumber() {
		return accountNo;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double theBalance) {
		balance = theBalance;
	}

	public int getDeposits() {
		return deposits;
	}

	public int getWithdrawals() {
		return withdrawals;
	}

	public void deposit(double amount) {
		balance += amount;
		deposits++;
	}

	public void withdrawal(double amount) {
		balance -= amount;
		withdrawals++;
	}
}
