class Book
{
	static int bookIdCount;
	int bookId;
	float price;
	

	Book()
	{
		bookIdCount++;
		bookId=bookIdCount;
	}

	Book(float p)
	{
		bookIdCount++;
		bookId=bookIdCount;
		price=p;
	}

	public void displayBook()
	{
		System.out.println("Book ID:"+ bookId+ " --> Price: "+ price);
	}
}