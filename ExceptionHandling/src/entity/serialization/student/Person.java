package entity.serialization.student;

import java.io.Serializable;

import entity.serialization.Date;

public class Person implements Serializable {
	String name;
	Date birthDate;

	public Person() {
		name = "Unknown";
		// birthDate=new Date1(0,0,0);
	}

	public Person(String s, int dd, int mm, int yy) {
		name = s;
		birthDate = new Date(dd, mm, yy);
	}

	public Person(String s, Date d) {
		name = s;
		birthDate = d;
	}

	public void display() {
		System.out.println("Person's Name: " + name);
		if (birthDate != null) {
			System.out.print("Person's BirthDate: " + birthDate.showDate());

		}

	}

	public String toString() {
		return "Name:" + name + "\n" + "BirthDate:" + birthDate.showDate();
	}
}
