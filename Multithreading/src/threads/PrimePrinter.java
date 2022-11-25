package threads;

import java.io.File;
import java.lang.Math;

public class PrimePrinter implements Runnable {
	private Thread t;
	private int n1;
	private int n2;
	
	public PrimePrinter(int n1,int n2) {
		t = new Thread(this);
		this.n1 = n1;
		this.n2 = n2;

	}
	@Override
	public void run() {
		boolean f=false;
		for(int i=n1;i<=n2;++i)
		{
			f=false;
			for(int j=2;j<=Math.sqrt(i);++j)
			{
				if(i%j==0)
				{
					f=true;
					break;
				}
			}
			if(!f)
			{
				System.out.println(i);
			}
		}

	}
	
	public Thread getT() {
		return t;
	}

}
