package entitty.book;

import entitty.Book;

public class PaperBook extends Book {
	double dlv_charge;

	public PaperBook(String title, double price) {
		super(title, price);

	}

	public double calcCost() {
		if (price <= 500)
			dlv_charge = 7;
		else if (price <= 1000)
			dlv_charge = 5;
		else if (price <= 5000)
			dlv_charge = 2;
		return price + price * dlv_charge / 100;
	}
}
