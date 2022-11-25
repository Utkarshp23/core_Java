package app;

import threads.Decounter1;
import threads.Decounter2;
import threads.Decounter3;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
	
		Decounter1 d1= new Decounter1(500);
		Decounter2 d2= new Decounter2(500);
		Decounter3 d3= new Decounter3(500);
		System.out.println("Main decounting Started.....");
		
		d1.getT().start();
		d2.getT().start();
		d3.getT().start();
		
		d1.getT().join();
		d2.getT().join();
		d3.getT().join();
		
		System.out.println("Main decounting Ended");
		

	}

}
