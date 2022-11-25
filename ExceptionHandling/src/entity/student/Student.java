package entity.student;

public class Student {
	private String name;
	private String countryName;
	
	public void registerUser(String a, String b) throws InvalidCountryException
	{
		this.name=a;
		
		if(!b.equals("India"))
		{
			throw new InvalidCountryException();
		}
		this.countryName=b;
		System.out.println("User registration Succesful");
	}
}
