package threads;

public class Consumer implements Runnable {
	private Thread t;
	private Stock s;

	public Consumer(Stock s) {
		this.s = s;
		t=new Thread(this);
	}

	@Override
	public void run() {
		while(s.getStop())
		{
			s.consume();
		}

	}
	
	public Thread getT()
	{
		return t;
	}

}
