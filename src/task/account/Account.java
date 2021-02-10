package task.account;

public class Account {

	private String iD;
	private String name;
	private int balance = 0;

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(String iD, String name, int balance) {
		super();
		this.iD = iD;
		this.name = name;
		this.balance = balance;
	}

	public int credit(int amount) {
		return balance + amount;
	}

	public int debit(int amount) {
		if (amount <= balance)
			balance = balance - amount;
		else
			System.out.println("Amount exceeded balance!");
		return balance;
	}

	public int transferTo(Account accountName, int amount) {
		if (this.balance >= amount) {
			accountName.balance += amount;
			this.balance -= amount;
		} else
			System.err.println("Insufficient funds!");
		return balance;
	}
	
}
