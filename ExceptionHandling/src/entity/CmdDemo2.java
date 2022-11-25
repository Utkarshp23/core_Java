package entity;

import java.util.Scanner;

public class CmdDemo2 {

	public static void main(String[] args) {
	
		System.out.println("Enter the size of array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr [ ]=new int[n];
		
	
	
	try
	{
	for(int i=0;i<n;i++) {
	
		System.out.println("Enter the array elements");
		arr[i]=sc.nextInt();
	
	}
	int index;
	System.out.println("Enter the index number:");
	index=sc.nextInt();
	System.out.println("at the position of"+index+"element is"+arr[index]);
	}
	catch(RuntimeException e)
	{
		e.getMessage();
		
	}
	catch(Exception e)
	{
		e.getMessage();
	}
	
}
}
	