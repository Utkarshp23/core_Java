package enity.IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharIo {

	public static void main(String[] args) {

		BufferedReader br=null;
		int cnt=0,cnt1=0;
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			int i=0;
			System.out.println("Enter 'q' to stop");
		 
			while( (i=br.read())!='q')
			{
				if(i>=65 && i<=90 || i>=97&& i<=122)
					cnt++;
				if(i>=48 && i<=57)
					cnt1++;
				System.out.println((char)i);
				
			}
			System.out.println("Cnt:"+cnt+"\nCnt1:"+cnt1);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
		
			try
			{
				br.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}

	}

}
