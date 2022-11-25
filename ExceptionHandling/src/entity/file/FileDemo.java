package entity.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Writer;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Taking input using buffered stream
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter file name with extension:");
		String fname;
	
		fname=br.readLine();
		
		//Creating file output stream to write the data
		String temp="D:\\RawData\\"+fname;
		
		//Instance of bytestream
//		OutputStream s= new FileOutputStream(temp);
		
		//Instance of character stream;
		Writer w= new FileWriter(temp);
		
		System.out.println("Enter test data: (Enter 'stop' to quit) ");
		String line;
		
		while(!((line=br.readLine()).equals("stop")))
		{
//			s.write(line.getBytes());
		
			w.write(line);
			w.write((int)'\n');
		}
		w.close();
		System.out.println("Data read from file:");
		InputStream is= new FileInputStream(temp);
		int i;
		while((i=is.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		
	}

}
