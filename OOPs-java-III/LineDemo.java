public class LineDemo
{
	public static void main(String[] args)
	{
		Line l1=new Line();
		l1.display();

		
		Line l2=new Line(1,2,5,6);
		l2.display();

		Point p1= new Point(8,9);
		Point p2= new Point(12,13);
        	
		Line l3=new Line(p1,p2);
		l3.display();
	}
}