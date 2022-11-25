class Calculater
{
	int no1;
	int no2;
	

	Calculater()
	{
		no1=0;
		no2=0;
		
	}

	Calculater(int no1,int no2)
	{
		this.no1=no1;
		this.no2=no2;
		
	}
	
	public void add()
	{
		System.out.println("Addition is:"+ (no1+no2));
	}
	public void sub()
	{
		System.out.println("Substraction is:"+ (no1-no2));
	}
	public void mult()
	{
		System.out.println("Multiplication is:"+ (no1*no2));
	}
	public void div()
	{
		//float f=(float)(no1/no2);
		System.out.println("Division is: "+((float)no1/no2));
		//System.out.println();
	}
	

}