public class AccountDemo
{
	public static void main(String [] args)
	{
		Account a=new Account();
		a.displayAcc();

		Account a1= new Account(1,1000);
		a1.displayAcc();
		Account.updateRate(6f);
		a1.displayAcc();
		
		
	}

}