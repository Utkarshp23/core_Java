package multi.second.threads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class OutThread implements Runnable {
	private Thread t;
	private int n;
	private File f;
	public OutThread(int n,File f)
	{
		this.n=n;
		this.f=f;
		t=new Thread(this);
	}
	@Override
	public void run() {
		
		synchronized(this)
		{
		    try {
				Writer w= new FileWriter(f,true);
				w.write("Divisors of "+n+" number are:");
				for(int i=1;i<=n;++i)
				{
					if(n%i==0)
					{
					w.write(i+" ");
					}
				}
				w.write("\n");
				w.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}
	
	public Thread getT()
	{
		return t;
	}


}
