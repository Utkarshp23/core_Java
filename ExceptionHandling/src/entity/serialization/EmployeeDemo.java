package entity.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Employee[] e = { new SalesManager("Rahul", 23, 4, 2000, 1001, 10000, 15000, 4.5),
				new Programmer("Keshav", 13, 2, 1996, 1002, 50000, 50, 1000),
				new Admin("Krishna", 23, 4, 2000, 1003, 10000, 5000) };

		File f = new File("D:\\RawData\\objectdat.dat");

		ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(f));

		for (Employee a : e) {
			obj.writeObject(a);
		}
		obj.close();

		ObjectInputStream ino = new ObjectInputStream(new FileInputStream(f));

		List<Employee> emps = new ArrayList<>();
		while (true) {

			try {

				Employee g = (Employee) ino.readObject();
//				System.out.println(g);

				emps.add(g);

			} catch (Exception m) {
//				m.printStackTrace();
				break;
			}
		}
		for (int i = 0; i < emps.size(); ++i) {
			System.out.println(emps.get(i));
			System.out.println("___________________");
		}

	}

}
