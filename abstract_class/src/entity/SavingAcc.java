package entity;

public class SavingAcc extends Account {
	static double int_rate=5;

	public SavingAcc(int a, String b, double c) {
		super(a, b, c);

	}

	public void withdraw(double amt) {
		if (this.balance - amt > 2000) {
			balance -= amt;
			System.out.println("Withdraw Successfull !!!!!!");
		} else {
			System.out.println("Unable to withdraw");
		}
	}
	
	public double calcBalance()
	{
		balance= balance+(((double)balance*int_rate)/100);
		return balance;
	}

	public String toString() {
		return super.toString()+"\nBalance:"+calcBalance();
	}
}
