package entity;

import java.util.Scanner;

public class Student {
	int roll_no;
	String name;
	int no_of_sub;
	int [] marks_of_sub;
	float per;
	
	public Student(int r,String name,int n) {
		roll_no=r;
		this.name=name;
		no_of_sub=n;
		marks_of_sub=new int[no_of_sub];
		
	}
	
	public void enter_marks()
	{
		System.out.println("Enter Subject wise Marks:");
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<no_of_sub;++i)
		{
			marks_of_sub[i]=sc.nextInt();
		}
	}
	
	public void calc_perc()
	{
		int sum=0;
		for(int i=0;i<no_of_sub;i++)
		{
			sum+=marks_of_sub[i];
		}
		per=((float)sum/(100*no_of_sub))*100;
		
	}
	
	public void display()
	{
		System.out.println("Student's Roll no.: "+roll_no);
		System.out.println("Student's Name:"+name);
		System.out.println("Number of Subjects: "+no_of_sub);
		System.out.println("Subject wise Marks:");
		for(int i=0;i<no_of_sub;++i) 
		{
			System.out.print(marks_of_sub[i]+" ");
		}
		System.out.println();
		System.out.println("Total Percentage: "+ per);
		System.out.println();
	}
	
	
}
