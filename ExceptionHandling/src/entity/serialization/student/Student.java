package entity.serialization.student;

import java.util.Calendar;

public class Student extends Person {
		private Course c;
		private String prn;
		private transient int age;
		public Student(String name,int dd,int mm, int yy,Course c, String prn) {
			super(name,dd,mm,yy);
			this.c = c;
			this.prn = prn;
			int year=Calendar.getInstance().get(Calendar.YEAR);
			this.age = year-yy;
		}
		@Override
		public String toString() {
			return "Student [c=" + c + ", prn=" + prn + ", age=" + age + ", name=" + name + ", birthDate=" + birthDate.showDate()
					+ ", toString()=" + super.toString() 
					+ "]";
		}
		
		
		
		
}
