package multi.second.app;

import java.io.File;
import java.util.Scanner;

import multi.second.threads.OutThread;

public class Demo {

	public static void main(String[] args) {
		
//		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
//		OutThread o= new OutThread(n);
//		
//		o.getT().start();
		File f= new File("D:\\RawData\\demo.txt");
		System.out.println("Enter the 3 number");
	
		int [] is=new int[3];
	
		OutThread []all= new OutThread[3];
		
		for(int i=0;i<3;++i)
		{
			is[i]=sc.nextInt();
			all[i]=new OutThread(is[i],f);
			all[i].getT().start();
		}
		
		
		
		

	}

}
