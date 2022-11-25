package threads;

public class Stock {
	
	private int qProduced;
	private int qConsumed;
	private boolean flag;
	private boolean tflag=true;
	
	
	public synchronized void produce()
	{
		if(flag)
		{	try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		qProduced++;
		System.out.println("p : "+ qProduced);
		this.setState();
		notify();
	}
	
	public synchronized void consume()
	{
		if(!flag)
		{	try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		qConsumed++;
		System.out.println("c : "+ qConsumed);
		this.setState();
		notify();
	}

	public void setState()
	{
		flag=(!flag);
	}
	
	public void terminate()
	{
		tflag=false;
		
	}
	public boolean getStop()
	{
		return tflag;
	}
	
	public int getP()
	{
		return qProduced;
	}
	public int getC()
	{
		return qConsumed;
	}
}
