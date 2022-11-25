package office.utility;

public class Date {
	int dd;
	int mm;
	int yy;

	public Date()
	{
		dd=1;
		mm=1;
		yy=1900;
	}

	public Date(int dd,int mm,int yy)
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
