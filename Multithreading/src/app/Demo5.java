package app;

import threads.PrimePrinter;

public class Demo5 {

	public static void main(String[] args) {
		
		PrimePrinter p= new PrimePrinter(2,200);
		
		p.getT().start();

	}

}
