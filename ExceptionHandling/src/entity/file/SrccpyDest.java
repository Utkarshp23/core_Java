package entity.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

public class SrccpyDest {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Source file name with extension:");
		String fname1;

		fname1 = br.readLine();

		System.out.println("Enter Destination file name with extension:");
		String fname2;

		fname2 = br.readLine();

		File f1 = new File("D:\\0106_0036\\javaProgramming\\OOPS_III\\src\\entity\\" + fname1);
		File f2 = new File("D:\\RawData\\" + fname2);
		
		if(f1.exists()&&f1.canRead() && f2.exists() && f2.canWrite() )
		{	
		BufferedReader r = new BufferedReader(new FileReader(f1));
		BufferedWriter w = new BufferedWriter(new FileWriter(f2));

		String line;
		int i=1;
		while ((line = r.readLine()) != null) {
			w.write((i++)+". "+line+"\n");
		}
		r.close();
		w.close();
		}
	}

}
