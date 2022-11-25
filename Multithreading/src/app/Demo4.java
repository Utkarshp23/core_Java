package app;

import java.io.File;
import java.util.Scanner;

import threads.FileCopier;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter source file name:");
		String f1name=sc.next();
		System.out.println("Enter Destination file name:");
		String f2name=sc.next();
		
		File f1= new File("D:\\RawData\\"+f1name);
		File f2= new File("D:\\RawData\\"+f2name);
		
		FileCopier f= new FileCopier(f1,f2);
		
		System.out.println("File Copying Started......");
		f.getT().start();
		
		f.getT().join();
		System.out.println("File Copying Ended......");
	}

}
