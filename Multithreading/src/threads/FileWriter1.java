package threads;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;

public class FileWriter1 implements Runnable {
	private Thread t;
	private File f;
	

	public FileWriter1(File f) {
		t = new Thread(this);
		this.f = f;
	

	}

	@Override
	public void run() {
		try {
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter w= new BufferedWriter(new FileWriter(f));
//			Writer w = new FileWriter(f);

			String l;
			System.out.println("Enter 'stop' to quit:");
			while (!((l = b.readLine()).equals("stop"))) {
				w.write(l+"\n");
				w.flush();
			}
			b.close();
			w.close();
		} catch (Exception e) {

		}

	}

	public Thread getT() {
		return t;
	}
}
