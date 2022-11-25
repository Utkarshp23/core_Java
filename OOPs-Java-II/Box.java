class Box
{
	int h;
	int w;
	int d;
	int volume;
	Box()
	{
		h=1;
		w=1;
		d=1;
	}
	Box(int h,int w,int d)
	{
		this.h=h;
		this.w=w;
		this.d=d;

	}
	Box(int d)
	{
		this.h=d;
		this.w=d;
		this.d=d;

	}
	

	public void displayV()
	{
		System.out.println("Volume is: "+  volume);
	}

	public void vol()
	{
		volume=h*w*d;
	}

}