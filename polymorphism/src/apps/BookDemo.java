package apps;

import java.util.Scanner;

import entitty.Book;
import entitty.book.*;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] b = new Book[5];

		Scanner sc = new Scanner(System.in);
		for (Book t : b) {
			System.out.println("Enter the type of Book: ");
			String tp = sc.next();
			System.out.println("Enter Name of Book: ");
			String name = sc.next();
			System.out.println("Enter Price of Book: ");
			double price = sc.nextInt();

			if (tp.equals("ebook")) {
				t = new Ebook(name, price);
				System.out.println("Cost of Ebook --> " + t.getTitle() + ": " + t.calcCost());
			} else {
				t = new PaperBook(name, price);
				System.out.println("Cost of PaperBook --> " + t.getTitle() + ": " + t.calcCost());
			}

			System.out.println("-----------------------------------------------------------");
		}
	}

}
