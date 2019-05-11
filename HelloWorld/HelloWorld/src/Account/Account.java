package Account;

public class Account {
	private String userName;
	private String passWord;
	private int accountID;
	private double balance;

	public Account() {
		System.out.println("Just create a new Account");
	}
	public Account(String userName, String passWord, int accountID, double balance) {
		this.userName = userName;
		this.passWord = passWord;
		this.accountID = accountID;
		this.balance = balance;
		System.out.println("Init data types");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account info:\nUserName:\t" + userName + "\nPassWord:\t" + passWord + "\nAccountID:\t" + accountID
				+ "\nBalance\t" + balance;
	}

}
