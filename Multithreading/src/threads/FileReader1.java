package threads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class FileReader1 implements Runnable {
	private Thread t;
	private File f;

	public FileReader1(File f) {
		t = new Thread(this);
		this.f = f;

	}

	@Override
	public void run() {
		try {
			BufferedReader b = new BufferedReader(new FileReader(f));

			String l;

			while (true) {
				l=null;
				while ((l = b.readLine()) != null) {
					System.out.println(l);
				}
//				System.out.println(l);
			}
			// b.close();

		} catch (Exception e) {

		}

	}

	public Thread getT() {
		return t;
	}
}
