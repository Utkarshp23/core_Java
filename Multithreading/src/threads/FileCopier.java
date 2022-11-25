package threads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class FileCopier implements Runnable {
	private Thread t;
	private File f1;
	private File f2;

	public FileCopier(File f1, File f2) {
		t = new Thread(this);
		this.f1 = f1;
		this.f2 = f2;

	}

	@Override
	public void run() {
		try {
			BufferedReader b = new BufferedReader(new FileReader(f1));
			Writer w = new FileWriter(f2);

			String l;
			while ((l = b.readLine()) != null) {
				w.write(l+"\n");
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
