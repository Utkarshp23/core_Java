package entity.userdefined;

import java.util.Scanner;

public class UserDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter the password:");
		Scanner sc= new Scanner(System.in);
		String pwd=sc.next();
		
		if(pwd.length()<8)
		{
			throw new PasswordTooShortException();
		}
		
		if(pwd.length()>12)
		{
			throw new PasswordTooLongException();
		}
		System.out.println("Correct password");
		
		
		
	}

}
