package entity;

public class CmdDemo1 {

	public static void main(String[] args) {
		
		try
		{
			int n1;
			int n2;
			n1=Integer.parseInt(args[0]);
			n2=Integer.parseInt(args[1]);
			System.out.println("Division:"+(n1/n2));
		}	
		catch(RuntimeException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	
	

	}

}
