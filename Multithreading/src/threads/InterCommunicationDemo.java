package threads;

public class InterCommunicationDemo {

	public static void main(String[] args) throws InterruptedException {
		Stock s= new Stock();
		Producer p =new Producer(s);
		Consumer c= new Consumer(s);
		
		p.getT().start();
		c.getT().start();
		
		Thread.sleep(100000);
		
		s.terminate();
		
		
		p.getT().join();
		c.getT().join();
		

		
		System.out.println("Total Quantity Produced:"+s.getP());
		System.out.println("Total Quantity Produced:"+s.getC());
	}

}
