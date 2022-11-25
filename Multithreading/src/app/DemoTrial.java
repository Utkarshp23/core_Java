package app;

import java.io.File;

import threads.FileCopier;
import threads.FileReader1;
import threads.FileWriter1;

public class DemoTrial {

	public static void main(String[] args) throws InterruptedException {
		File f1= new File("D:\\RawData\\demo.txt");
//		File f2= new File("D:\\RawData\\");
		
		FileWriter1 w= new FileWriter1(f1);
		FileReader1 r= new FileReader1(f1);
		System.out.println("File Copying Started......");
		w.getT().start();
//		Thread.sleep(1000);
		r.getT().start();
		
		
		r.getT().join();
		w.getT().join();
		System.out.println("File Copying Ended......");
//		r.getT().stop();
	}

}
