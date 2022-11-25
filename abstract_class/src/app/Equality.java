package app;

import entity.Date;
public class Equality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Date d1= new Date(28,4,2000);
      Date d2= new Date(28,8,2000);
      System.out.println(d1==d2);
//      d1=d2;
      System.out.println(d1==d2);
      System.out.println(d1.equals(d2));
	}

}
