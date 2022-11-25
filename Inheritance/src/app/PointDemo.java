package app;

import entity.ColorPoint;
import entity.Point;

public class PointDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new ColorPoint(1,2,"Pink");
		p.display();
		Point p1=new ColorPoint(1,2,"Red");
		p1.display();
	}

}
