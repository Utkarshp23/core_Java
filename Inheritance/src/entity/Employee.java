package entity;

public class Employee extends Person {
	int empid;
	int salary;
	public Employee() {
		super();
		
	}
	public Employee(String s, Date d,int empid,int salary) {
		super(s, d);
		this.empid=empid;
		this.salary=salary;
		
	}
	public Employee(String s, int dd, int mm, int yy,int empid,int salary) {
		super(s, dd, mm, yy);
		this.empid=empid;
		this.salary=salary;
		
		
	}
	
	public void display()
	{
		//super.display();
		System.out.println("Employee id:"+empid);
		System.out.println("Employee salary:"+salary);
	}
	
	public String toString()
	{
		return super.toString()+"\nEmployee id:"+empid +"\nEmployee salary:"+salary;
	}
	
	

}
