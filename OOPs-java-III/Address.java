class Address
{
	String area;
	String city;
	String pincode;
	
	Address()
	{
		area="N/A";
		city="N/A";
		pincode="N/A";
	}
	Address(String a,String b, String c)
	{
		area=a;
		city=b;
		pincode=c;
	}
	
	public void showAddress()
	{
		System.out.println("Address : "+ area + ","+city+ ","+pincode);
	}

}