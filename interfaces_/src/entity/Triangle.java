package entity;

public class Triangle implements Drawable {
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public void drawShape()
	{
		System.out.println("Drawing Triangle:");
	}
	
	public double calculateArea()
	{
		return base*height/2;
	}
}
