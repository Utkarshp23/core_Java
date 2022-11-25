package multi.second.app;

import multi.second.threads.Printer;

public class PrintingTask implements Runnable {

	private Thread t;
	private String header,body,footer;
	private Printer p;
	public PrintingTask(String s1,String s2, String s3,Printer p)
	{
		t= new Thread(this);
		header=s1;
		body=s2;
		footer=s3;
		this.p=p;
	}
	@Override
	public void run() {
		p.print(header,body, footer );

	}
	
	public Thread getT()
	{
		return t;
	}

}
