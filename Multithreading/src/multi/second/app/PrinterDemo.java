package multi.second.app;

import multi.second.threads.Printer;

public class PrinterDemo {

	public static void main(String[] args) throws InterruptedException {
		Printer p = new Printer();

		PrintingTask p1 = new PrintingTask("(", "Header", ")", p);
		PrintingTask p2 = new PrintingTask("{", "Body", "}", p);
		PrintingTask p3 = new PrintingTask("[", "Footer", "]", p);

		System.out.println("Printing Started....");
//		p1.getT().setPriority(Thread.MIN_PRIORITY);

		p1.getT().start();
		p1.getT().join();
//		p2.getT().setPriority(Thread.MAX_PRIORITY);
		p2.getT().start();
		p2.getT().join();
//		p3.getT().setPriority(Thread.MIN_PRIORITY);
		p3.getT().start();
		p3.getT().join();
		
	
	

		System.out.println("Printing Ended....");
	}

}
