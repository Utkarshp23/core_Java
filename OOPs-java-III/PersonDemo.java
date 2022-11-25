public class PersonDemo
{
	public static void main(String[] args)
	{
		Person1 p=new Person1();
		p.display();

		
		Person1 p1=new Person1("Utkarsh",28,4,2000);
		p1.display();

		Date1 m= new Date1(23,7,2000);
        	String s="Harshad";

		Person1 p2=new Person1(s,m);
		p2.display();
	}
}