package entity.student;

import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username:");
		String uname=sc.next();
		System.out.println("Enter the country name:");
		String cname=sc.next();
		
		try
		{
			s.registerUser(uname, cname);
		}
		catch(InvalidCountryException e)
		{
			System.out.println(e);
		}
	}

}
