package app;

import java.util.Scanner;

public class Student1Demo {

	public static void main(String[] args) {
		int roll_no;
		int no_of_sub;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rollnumber:");
		roll_no=sc.nextInt();
		System.out.println("Enter the Name:");
		name=sc.next();
		System.out.println("Enter the number of subject:");
		no_of_sub=sc.nextInt();
		
		int [] marks_of_sub=new int[no_of_sub];
		for(int i=0;i<no_of_sub;i++)
		{
			marks_of_sub[i]=sc.nextInt();
		}
		
	}

}
