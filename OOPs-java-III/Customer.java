class Customer
{
	String email;
	Address a;
	

	Customer()
	{
		email="N/A";
	}

	Customer(String s, String area, String city, String pincode)
   	{
		email=s;
		a=new Address(area ,city, pincode);
	}
	Customer(String s, Address d)
	{
		email=s;
		a=d;
	}

	public void display()
	{
		System.out.println("Customers's email: "+ email );
		if(a!=null)
		{
			a.showAddress();
		}
		
		
	}
}