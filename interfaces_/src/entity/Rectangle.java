package entity;

public class Rectangle  implements Drawable{
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth)
	{
		this.breadth=breadth;
		this.length=length;
	}
	
	public void drawShape()
	{
		System.out.println("Drawing Rectangle:");
	}
	
	public double calculateArea()
	{
		return length*breadth;
	}
}
