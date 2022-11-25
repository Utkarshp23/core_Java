package entity;

public class Box {
	int h;
	int w;
	int d;
	int volume;
	public Box()
	{
		h=1;
		w=1;
		d=1;
	}
	public Box(int h,int w,int d)
	{
		this.h=h;
		this.w=w;
		this.d=d;

	}
	public Box(int d)
	{
		this.h=d;
		this.w=d;
		this.d=d;

	}
	public int volume()
	{
		return h*w*d;
	}

	public void displayV()
	{
		System.out.println("Volume is: "+ volume());
	}

}
