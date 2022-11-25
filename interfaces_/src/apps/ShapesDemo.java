package apps;

import entity.*;
public class ShapesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable []d= new Drawable[3];
		d[0]=new Circle(3);
		d[1]=new Rectangle(3,4);
		d[2]=new Triangle(5,6);
		
		for(Drawable a:d)
		{
			a.drawShape();
			System.out.println("Area :"+a.calculateArea());
			System.out.println("____________________");
		}
	}

}
