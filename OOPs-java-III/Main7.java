public class Main7
{
	public static void main(String[] args)
	{
		Box [] b= new Box[3];
		
		

		for(int i=0;i<b.length;++i)
		{
			b[i]=new Box(i);
			b[i].displayV();
		}
	}
}