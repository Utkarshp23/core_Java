class Complex
{
	int x;
	int y;

	Complex()
	{
		x=0;
		y=0;
		

	}
	
	
	Complex(int x,int y)
	{
		this.x=x;
		this.y=y;
		

	}
	

	public void display()
	{
		if(y>0){
		System.out.println(x+"+"+y+"i");
		}
		else
		System.out.println(x+""+y+"i");
	}

}