package app;
import java.util.Scanner;

import entity.Student;
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int roll_no;
		int no_of_sub;
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name of Student:");
		name=sc.next();
		System.out.println("Enter Roll no. of Student:");
		roll_no=sc.nextInt();
		System.out.println("Enter no. of Subjects:");
		no_of_sub=sc.nextInt();
		
		Student s= new Student(roll_no,name,no_of_sub);
		s.enter_marks();
		s.calc_perc();
		s.display();
		
		Student s1= new Student(106,"Utkarsh",5);
		s1.enter_marks();
		s1.calc_perc();
		s1.display();
	}

}
