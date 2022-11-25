package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Counts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the file name:");
		String name;
		Scanner sc=new Scanner(System.in);
		name =sc.next();
		
		File f= new File("D:\\RawData\\"+name);
		BufferedReader b= new BufferedReader(new FileReader(f));
//		Reader r= new FileReader(f);
		
		int c1=0;
		int c2=0;
		int c3=0;
		int i=0;
		int temp=i;
		while((i=b.read())!=-1)
		{
			c1++;
			if(i==(char)'\n') {
				c2++;
			}
			if(i==32)
				c3++;
			temp=i;
		}
		System.out.print("Characters:"+(c1-2*c2));
		if((char)temp!='\n')
		{
			c2++;
		}
		System.out.println("\nNumber of Lines:"+c2+"\nNumber of Words:"+(c3+c2));
		
	}

}
