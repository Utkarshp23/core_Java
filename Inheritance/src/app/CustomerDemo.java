package app;

import java.util.Scanner;

import entity.Customer;
import entity.RegCustomer;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int ch = 0;
		
		String email;
		String address;
		int reg_no;
		int shop_price=0;

		while (ch != 3) {

			System.out.print("MAIN MENU\n");
			System.out.print("---------------\n");
			System.out.print("1::Customer\n");
			System.out.print("2::Special Customer\n");
			System.out.print("3::Exit\n");
			System.out.print("---------------\n");
			System.out.println("Enter the type of customer:");
			ch=sc.nextInt();
			
			if(ch>=3) break;
			
			System.out.print("Enter the Email:\n");
			email=sc.next();
			System.out.print("Enter the Address:\n");
			address=sc.next();
			System.out.print("Enter the Shopping price:\n");
			shop_price=sc.nextInt();
			Customer c;
			
			switch (ch)
			{
			case 1:
				c= new Customer(email,address);
				System.out.println("Total price: "+c.giveDiscount(shop_price));
				
				break;
				

			case 2:
				
				System.out.print("Enter the Registration No.:\n");
				reg_no=sc.nextInt();
			    c= new RegCustomer(email,address,reg_no);
				System.out.println("Total price: "+c.giveDiscount(shop_price));
				System.out.println();
				break;

			case 3:
				break;

			default:System.out.println("Enter valid choice\n");
				break;
			}
		}
	}
}
