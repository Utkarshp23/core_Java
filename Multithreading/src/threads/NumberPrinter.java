package threads;

public class NumberPrinter implements Runnable {
	private Thread t;
	private int n;
	public NumberPrinter(int n)
	{
		this.n=n;
		t=new Thread(this);
	}
	@Override
	public void run() {
		
		for(int i=1;i<=n;++i)
		{
			System.out.println(i);
			try {
				Thread.sleep(500);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}
	
	public Thread getT()
	{
		return t;
	}

}
