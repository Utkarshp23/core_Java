package entity.serialization.student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentDemo {

	public static void main(String[] args) throws IOException {
		
		
		Student[] arr=new Student[3];
		Course c=new Course("cdac",1005,110000);
		 arr[0]=new Student("utkarsh",12,10,2000,c,"106");
		 arr[1]=new Student("harshad",12,10,1998,c,"0036");
		 arr[2]=new Student("mohanlala",12,10,2010,c,"109");
		 
		 System.out.println(arr[1]);
		 System.out.println("_____________________");
		 ObjectOutputStream o1=new ObjectOutputStream(new FileOutputStream("D:\\RawData\\Studentinfo.dat"))	;
		 for(Student a:arr)
		 {
			 o1.writeObject(a);
		 }
		 o1.close();
		 
		 ObjectInputStream o2=new ObjectInputStream(new FileInputStream("D:\\RawData\\Studentinfo.dat"))	;
		 while(true)
		 {
			 try
			 {
				 Student s=(Student)o2.readObject();
				 System.out.println(s);
				 System.out.println("_____________________");
			 }
			 catch(Exception e)
			 {
				 break;
			 }
		 }
		 
	}

}
