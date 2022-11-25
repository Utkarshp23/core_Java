package app;

import threads.NumberPrinter;

public class Demo2 {

	public static void main(String[] args) throws Exception {
//		Runnable r= new NumberPrinter(5);
//		Thread t= new Thread(r);
		
		NumberPrinter r= new NumberPrinter(5);
		System.out.println("Counting started....");
		r.getT().start();
		
		r.getT().join();
		System.out.println("Counting Ended....");

	}

}
