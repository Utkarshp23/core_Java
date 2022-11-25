package entity;

public class Circle  implements Drawable{
	private double r;
	final private double PI=3.14;
	
	public Circle(double r) {
		super();
		this.r = r;
	}
	
	public void drawShape()
	{
		System.out.println("Drawing Circle:");
	}
	
	public double calculateArea()
	{
		return PI*r*r;
	}

	
}
