public class Main6
{
	public static void main(String[] args)
	{
		Calculater d1;
		d1=new Calculater();
		d1.add();	
		d1.sub();
		d1.mult();

		Calculater d2= new Calculater(2,4);
		d2.add();	
		d2.sub();
		d2.mult();
		d2.div();

	}
}