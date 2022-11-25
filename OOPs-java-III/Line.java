class Line
{
	Point startPoint;
	Point endPoint;
	

	Line()
	{
		startPoint=new Point();
		endPoint=new Point();
		
	}

	Line(int x1,int y1,int x2,int y2)
   	{
	
		startPoint=new Point(x1,y1);
		endPoint=new Point(x2,y2);
			
	}
	Line(Point p1,Point p2)
	{
		startPoint=p1;
		endPoint=p2;
	}

	public void display()
	{
		System.out.print("Line Co-ordinates: {");
		startPoint.display();
		System.out.print(",");
		endPoint.display();
		System.out.println("}");
	}
}