package app;

import java.util.Scanner;

import entity.*;

public class AccountDemo {

	public static void main(String[] args) {
		Account[] a = new Account[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; ++i) {
			System.out.println("Enter the type of account:");
			String type = sc.next();
			System.out.println("Enter Account no.:");
			int ac = sc.nextInt();
			System.out.println("Enter name of account holder:");
			String name = sc.next();
			System.out.println("Enter the balance:");
			double bal = sc.nextInt();

			if (type.equals("saving")) {
				a[i] = new SavingAcc(ac, name, bal);
				System.out.println("Enter the amount to be withdrawn:");
				double amt = sc.nextInt();
				a[i].withdraw(amt);
			} else {
				System.out.println("Enter the installment:");
				double inst = sc.nextInt();
				System.out.println("Enter the No. of installment:");
				int t = sc.nextInt();
				a[i] = new ReccuringAcc(ac, name, bal, inst, t);
//				b.setName();
			}
			System.out.println("----------------------------------------------");
		}

		System.out.println("*********************************");
		for (Account b : a) {
			System.out.println(b);
			System.out.println("----------------------------------------------");
		}
	}

}
