package entity.string;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string:");
		Scanner sc= new Scanner(System.in);
		String a=sc.next();
		StringOperations s=new NewString();
		System.out.println("Length: "+s.length(a));
		System.out.print("Reverse: ");
		s.reverse(a);
		System.out.print("Uppercase: ");
		s.toUpperCase(a);
		System.out.print("Is palindrome: ");
		if(s.isPalindrome(a)) 
		{
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
		System.out.println("Concatinated: "+s.append(a,a));
		
	}

}
