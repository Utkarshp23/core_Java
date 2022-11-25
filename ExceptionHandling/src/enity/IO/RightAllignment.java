package enity.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;

public class RightAllignment {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the File Name:");
		String s = b.readLine();

		File f = new File("D:\\RawData\\" + s);
		BufferedReader b1 = new BufferedReader(new FileReader(f));
		String l;
		int lCnt = 0;
		int maxLen = 0;
		int maxLno = 0;
		while ((l = b1.readLine()) != null) {
			lCnt++;
			if (l.length() > maxLen) {
				maxLno = lCnt;
				maxLen = l.length();
			}

		}
		b.close();
		b1.close();
		
		File f1= new File("D:\\RawData\\demo1.txt");
		Writer w=new FileWriter(f1);
		BufferedReader b2 = new BufferedReader(new FileReader(f));
		String p;
		int j=0;
//		System.out.println("l="+l);
		while ((p = b2.readLine()) != null) {
			int dashCnt = maxLen - p.length();
			j++;
			w.write(j+". ");
			for (int i = 0; i < dashCnt; ++i)
				w.write("-");

			w.write(p+"\n");
		}
		w.close();
		b2.close();
	}

}
