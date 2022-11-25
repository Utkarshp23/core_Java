package threads;

public class Producer implements Runnable {
    private Thread t;
	private Stock s;
	
	public Producer(Stock s)
	{
		this.s=s;
		t=new Thread(this);
	}
	@Override
	public void run() {
		while(s.getStop())
		{
			s.produce();
		}

	}
	
	public Thread getT()
	{
		return t;
	}

}
