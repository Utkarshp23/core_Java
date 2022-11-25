package enity.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class DirectoryOrFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the File Name: ");
		String s = b.readLine();
		File m = new File("D:\\RawData\\" + s);

		if (m.isFile()) {
			long size = m.length();
			System.out.println("Size of File= " + size);
			if (size > 25) {
				BufferedReader br = new BufferedReader(new FileReader(m));
				String l;
				while ((l = br.readLine()) != null) {
					System.out.println(l);
				}
				br.close();
			} else {
				Reader r = new FileReader(m);
				int i;
				while ((i = r.read()) != -1) {
					System.out.println((char) i);
				}
				r.close();
			}

		}
		if (m.isDirectory()) {
			String[] s1 = m.list();
			System.out.println("Files in Directory are: ");
			for (int i = 0; i < s1.length; ++i) {
				System.out.println(i + 1 + ". " + s1[i]);
			}
		}

	}

}
