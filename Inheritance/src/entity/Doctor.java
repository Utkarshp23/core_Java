package entity;

public class Doctor extends Person {
	String degree;
	int regno;
	int salary;
	public Doctor() {
		super();
		
	}
	public Doctor(String s, Date d,String degree,int regno,int salary) {
		super(s, d);
		this.degree=degree;
		this.regno=regno;
		this.salary=salary;
		
	}
	public Doctor(String s, int dd, int mm, int yy,String degree,int regno,int salary) {
		super(s, dd, mm, yy);
		this.degree=degree;
		this.regno=regno;
		this.salary=salary;
		
	}
	public void display() {
		super.display();
		System.out.println("\nDegree:"+degree+"\nRegistration number:"+regno+"\nSalary:"+salary);
	}
	
	public String toString()
	{
		return super.toString()+"\nDegree:"+degree+"\nRegistration number:"+regno+"\nSalary:"+salary;
	}

	

}
