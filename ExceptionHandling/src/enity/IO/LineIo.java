package enity.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineIo {

	public static void main(String[] args) {

		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
		int maxl=0;
		try {
			String l;
			System.out.println("Enter 'quit' to stop:");
		
			while(!((l=b.readLine()).equals("quit")))
			{
				if(l.length()>maxl) {
					maxl=l.length();
				}
				System.out.println(l);
			}
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Max length string is: "+maxl);
//			System.out.println(maxl);
			try {
				b.close();
			}
			catch(IOException e)
			{
			System.out.println(e);
			}
		
		}
		
	
		
	}

}
