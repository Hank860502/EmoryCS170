public class BankAccount {
	String owner;
	double balance;
	public BankAccount(String owner){
		this.owner = owner;
		balance = 0;
	}

	public void deposit(double money){
		balance += money;
	}

	public double withdraw(double money){
		if(money > balance){
			balance = 0;
			return balance;
		} else{
			balance -= money;
			return money;
		}
	}

	public String toString(){
		return "Acount owner: " + owner + ", balance " + balance;
	}

	public boolean equals(BankAcount other){
		return this.owner.equals.equals(other.owner) && this.balance == other.balance;
	}
}