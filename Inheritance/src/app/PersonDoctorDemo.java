package app;

import entity.Doctor;
import entity.Person;
import entity.Date;

public class PersonDoctorDemo {

	public static void main(String[] args) {
		
		Person p=new Doctor("don",23,7,2000,"MBBS",1001,100000);
		System.out.println(p);
		//p.display();
		System.out.println();
		Date d=new Date(12,3,2003);		
		Person p1=new Doctor("Harshad",d,"MD",1002,100000);
		System.out.println(p1);
	
	}

}
