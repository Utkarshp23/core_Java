package entity.point;



public class PointDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Point p=new ColorPoint(1,2,"Pink");
		p.display();
		Point p1=new ColorPoint(1,2,"Red");
		p1.display();
		}
		catch(InvalidColorException e)
		{
			System.out.println(e);
		}
	}

}
