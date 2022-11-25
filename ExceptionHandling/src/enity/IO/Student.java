package enity.IO;

public class Student {
	
	int rollno;
	String name;
   double [] marks;
	public Student(int rollno, String name, double [] marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	
	public double calcGrade()
	{
		int n=marks.length;
		double sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=marks[i];
		}
		return (double)sum/n;
	}
	
	public String toString()
	{
		return "Student rollno:"+rollno+"\nStudent Name:"+name+"\nStudent Grades:"+calcGrade();
	}
	

}
