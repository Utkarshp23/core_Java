package assignment1_3and4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Main {
	
	public static Customer[] enterCustomers(int n)
	{
		Customer [] c= new Customer[n];
		
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter type of"+(i+1)+" customer type : ");
			String type=sc.next();
			
			if(type.equals("normal"))
			{
				System.out.println("Enter name, email & contact no. :");
				c[i]=new Customer(sc.next(),sc.next(),sc.next());
			}
			
			if(type.equals("registered"))
			{
				System.out.println("Enter name, email , contact number & reg. no. :");
				c[i]=new RegCustomer(sc.next(),sc.next(),sc.next(),sc.nextInt());
			}
		}
		
		return c;
	}
	
	public static void saveCustomers(Customer [] c,File f) throws FileNotFoundException, IOException
	{
		ObjectOutputStream obj= new ObjectOutputStream(new FileOutputStream(f));
		
		for(Customer temp: c)
		{
			obj.writeObject(temp);
		}
	}
	
	public static void sortAndDisplayCustomers(File f) throws FileNotFoundException, IOException
	{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream(f));
		
		List<Customer> normalCustomers= new ArrayList<>();
		List<RegCustomer> registeredCustomers= new ArrayList<>();
		
		while(true)
		{
			try {
				Object obj=in.readObject();
				
				if(obj instanceof RegCustomer)
				{
					RegCustomer r=(RegCustomer)obj;
					registeredCustomers.add(r);
				}
				else {
					Customer cr=(Customer)obj;
					normalCustomers.add(cr);
				}
				
			}
			catch(Exception e)
			{
				break;
			}
			
			
		}
		
		System.out.println("Normal Customers are :");
		
		for(Customer m: normalCustomers)
		{
			System.out.println(m);
		}
		
	   System.out.println("-----------------------------------------------------------------------------");
       System.out.println("Registered Customers are :");
		
		for(RegCustomer r: registeredCustomers)
		{
			System.out.println(r);
		}
		
//		int [] a= new int[4];
//		a[0];
//		a[1];
		
//		int [][] a= new int[5][5];
		
//		List<List<RegCustomer>>  lr= new ArrayList<>();
//		lr.add((List<RegCustomer>)normalCustomers);
//		lr.add(registeredCustomers);
		
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		File f= new File("D:\\0106_0036\\javaProgramming\\abc.txt");
		
		System.out.println("Entering  Customers .......");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		Customer [] c= enterCustomers(5);
		
		System.out.println("Saving  Customers .......");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		saveCustomers(c,f);
		
		System.out.println("Sorting & Displaying  Customers .......");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		sortAndDisplayCustomers(f);
	}

}
