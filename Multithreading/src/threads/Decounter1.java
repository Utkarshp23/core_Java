package threads;

public class Decounter1 implements Runnable {

	private Thread t;
	private int n;
	
	public Decounter1(int n)
	{
		t= new Thread(this);
		this.n=n;
	}
	@Override
	public void run() {
		for(int i=n;i>0;i--)
		{
			System.out.println("Decounter1: "+ i);
		}

	}
	
	public Thread getT()
	{
		return t;
	}

}
