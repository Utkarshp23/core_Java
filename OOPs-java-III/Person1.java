class Person1
{
	String name;
	Date1 birthDate;
	

	Person1()
	{
		name="Unknown";
		//birthDate=new Date1(0,0,0);
	}

	Person1(String s, int dd,int mm, int yy)
   	{
		name=s;
		birthDate=new Date1(dd,mm,yy);
	}
	Person1(String s, Date1 d)
	{
		name=s;
		birthDate=d;
	}

	public void display()
	{
		System.out.println("Person's Name: "+ name );
		if(birthDate!=null)
		{
			System.out.print("Person's BirthDate: ");
			birthDate.showDate();
		}
		
		
	}
}