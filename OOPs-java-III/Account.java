class Account
{
	int accNum;
	float balance;
	static float int_rate;

	static
	{
		int_rate=12.0f;
	}

	public static void updateRate(float r)
	{
		int_rate=r;
	}

	Account()
	{
		accNum=0;
		balance=0.0f;
	}

	Account(int a, float b)
	{
		accNum=a;
		balance=b;
	}

	public void displayAcc()
	{
		System.out.println("Account No. : "+accNum+ " --> Balance : "+calcBalance());
	}

	public float calcBalance()
	{
		return balance+(balance*int_rate/100);
	}

}