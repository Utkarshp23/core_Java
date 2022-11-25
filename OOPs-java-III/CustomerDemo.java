public class CustomerDemo
{
	public static void main(String[] args)
	{
		Customer p=new Customer();
		p.display();

		
		Customer p1=new Customer("utkarshpawar2332@gmail.com","Amabavde","Satara","415506");
		p1.display();

		Address m= new Address("Mahim","Solapur","413306");
        	String s="ghongade@gmail.com";

		Customer p2=new Customer(s,m);
		p2.display();
	}
}