package entity;

public class ReccuringAcc extends Account {
	private double installment;
	private int no_of_installment;
	static double int_rate = 5;

	public ReccuringAcc(int a, String b, double c, double d, int n) {
		super(a, b, c);
		this.installment = d;
		no_of_installment = n;
	}

	public void withdraw(double amt) {

		System.out.println("Can't be Withdrawn");
	}

	public double calcBalance() {
		double totalbal = balance + (installment * no_of_installment);
		balance = totalbal + (((double) totalbal * int_rate) / 100);
		return balance;
	}

	public String toString() {
		return super.toString() + "\nInstallment:" + installment + "\nNo. of installments:" + no_of_installment
				+ "\nBalance:" + calcBalance();
	}
}
