class Date1
{
	int dd;
	int mm;
	int yy;

	Date1()
	{
		dd=1;
		mm=1;
		yy=1900;
	}

	Date1(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}

}