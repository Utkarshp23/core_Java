package entity;

public abstract class Account {
	protected int accno;
	protected String name;
	protected double balance;

	public Account(int a, String b, double c) {
		accno = a;
		name = b;
		balance = c;
	}

	public abstract void withdraw(double amt);
	
	public abstract double calcBalance();
	public String toString() {
		return "Account No.:" + accno + "\nAccount Holder's Name:" + name ;
	}
}