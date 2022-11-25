import java.util.*;
class Person
{
	String name;
	Date birthDate;
	int dd,mm,yy;

	Person()
	{
		name="";
		birthDate=new Date(0,0,0);
	}

	public void setBirthDate(int d,int m, int y)
	{
		birthDate= new Date(d,m,y);	
	}

	public void display()
	{
		System.out.println("Person's Name: "+ name + " -->BirthDate: "+birthDate);
	}
}