public class Main2
{
	public static void main(String[] args)
	{
		Box b1;
		b1=new Box();
		b1.volume();
		b1.displayV();

		Box b2;
		b2=new Box(2,3,5);
		b2.volume();
		b2.displayV();

		Box b3;
		b3=new Box(2);
		b3.volume();
		b3.displayV();

	}
	
}