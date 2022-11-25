package enity.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class CheckChnoFile {

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
		System.out.println("Line with Max characters: " + maxLno);

	}

}
