package entitty.book;

import entitty.Book;

public class Ebook extends Book {
	double discnt;

	public Ebook(String title, double price) {
		super(title, price);

	}

	public double calcCost() {
		if (price <= 500)
			discnt = 2;
		else if (price <= 1000)
			discnt = 5;
		else if (price <= 5000)
			discnt = 7;
		return price - price * discnt / 100;
	}
}
