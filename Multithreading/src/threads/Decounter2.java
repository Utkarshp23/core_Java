package threads;

public class Decounter2 implements Runnable {
	private Thread t;
	private int n;
	
	public Decounter2(int n)
	{
		t= new Thread(this);
		this.n=n;
	}
	@Override
	public void run() {
		for(int i=n;i>0;i--)
		{
			System.out.println("Decounter2: "+ i);
		}

	}
	
	public Thread getT()
	{
		return t;
	}

}
