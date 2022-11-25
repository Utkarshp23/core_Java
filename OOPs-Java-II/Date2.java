class Date2
{
	int dd;
	int mm;
	int yy;

	Date2()
	{
		dd=1;
		mm=1;
		yy=1900;
	}

	Date2(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}

	public void showDate(char ch)
	{
		String s=""+dd+ ch+mm+ch+yy;
		//System.out.println();
		System.out.println(s);
	}

}