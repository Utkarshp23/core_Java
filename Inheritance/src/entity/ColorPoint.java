package entity;

public class ColorPoint extends Point {
	String color;
	static String [] s= {"Green","Blue","Red","Yellow","Voilet","Indigo","Orange"};
	
	public ColorPoint()
	{
		super();
		color="NA";
	}
	
	public ColorPoint(int x,int y, String m)
	{
		super(x,y);
		boolean f=false;
		for(int i=0;i<s.length;++i)
		{
			if(m==s[i])
			{
				f=true;
				break;
			}
		}
		if(f)
		{
			color=m;
		}else {
			color="White";
		}
		
	}
	
	public  void display()
	{
		super.display();
		System.out.println(color+"]");
	}
}
