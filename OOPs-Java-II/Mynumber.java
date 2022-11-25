class Mynumber
{
	private int no;


	Mynumber()
	{
		no=0;	
	}
	Mynumber(int no)
	{
		this.no=no;
		
		
	}
	public void neg()
	{
		if(no<0)
		System.out.println(no+ " is Negative");

		
	}
	public void pos()
	{
		if(no>0)
		System.out.println(no+ " is Positive");

		
	}
	public void zero()
	{
		if(no==0)
		System.out.println(no+ " is Zero");

		
	}
	public void even()
	{
		if(no%2==0)
		System.out.println(no+ " is Even");

		
	}
	public void odd()
	{
		if(no%2!=0)
		System.out.println(no+ " is Odd");

		
	}
	
}