package apps;

import java.util.Scanner;

import entity.*;

public class NumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		IntOperations i = new MyNumber(n);

		if (i.isEven())
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");

		if (i.isPrime())
			System.out.println("Number is Prime");
		else
			System.out.println("Number is Not prime");

		System.out.println("Factorial is :" + i.calcFactorial());
	}

}
