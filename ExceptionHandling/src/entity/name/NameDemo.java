package entity.name;

import java.util.Scanner;

public class NameDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name");
		String f=sc.next();
		System.out.println("Enter the last name");
		String l=sc.next();
	
	
	try
	{
		Name s=new Name();
		s.check(f,l);
				
		
		
	}
	
	catch(CustomalyDefinedException e)
	{
		e.printStackTrace();
	}

}
}
