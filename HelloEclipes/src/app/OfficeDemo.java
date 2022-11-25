package app;
import java.util.Scanner;

import office.staff.Person;
import office.utility.Date;
public class OfficeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1= new Person();
		p1.display();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Person's Name:");
		String name=sc.next();
		System.out.println("Enter Person's BirthDate:");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		
		Person p2=new Person(name,dd,mm,yy);
		p2.display();
		
		System.out.println("Enter Person's Name:");
		String name2= sc.next();
		Date d=new Date(23,7,2000);
		
		Person p3=new Person(name2,d);
		p3.display();
	}

}
