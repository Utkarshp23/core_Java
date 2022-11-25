package multi.second.threads;

public class Printer {



	public synchronized void print(String s1,String s2, String s3)
	{
//		synchronized(this) { 
		try {
			
			System.out.println(s1);
			Thread.sleep(500);
			System.out.println(s2);
			Thread.sleep(500);
			System.out.println(s3);
//			Thread.sleep(200);
		}
		catch(Exception e)
		{
			
		}
//		}
	}

}
