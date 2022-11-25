package enity.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentInfo {

	public static void main(String[] args) {
	
		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			System.out.println("Enter student rollno: ");
			int rollno=Integer.parseInt(b.readLine());
			System.out.println("Enter student name: ");
			String name=b.readLine();
			System.out.println("Enter student No. of subjects: ");
			int no=Integer.parseInt(b.readLine());
			double []marks= new double[no];
			System.out.println("Enter student marks: ");
			for(int i=0;i<no;++i)
			{
				marks[i]=Double.parseDouble(b.readLine());
			}
			
		
			Student s=new Student(rollno,name, marks);
			System.out.println(s);
			
			
			
		}
		catch(IOException  e)
		{
//			System.out.println("hi");
			e.printStackTrace();
		}
		finally
		{
//			System.out.println("hi");
			try
			{
			b.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
