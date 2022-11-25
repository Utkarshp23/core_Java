package entity.name;

public class Name {
	
//	private String fname;
//	private String lname;
	
	public Name() {
		super();
		
	}

	public void check(String fname,String lname) throws CustomalyDefinedException
	
	{
		int a=(int)(fname.charAt(0));
		int b=(int)(lname.charAt(0));
		if(!((a>=65)&&(a<=90)))
				{
					throw new CustomalyDefinedException();
				}
		if(!((b>=65)&&(b<=90)))
				{
					throw new CustomalyDefinedException();
				}
	
		
		System.out.println("welcome"+fname+" "+lname);
		
	}
	
	
	
	

}
