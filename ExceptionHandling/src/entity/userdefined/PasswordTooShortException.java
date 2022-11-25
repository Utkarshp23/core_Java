package entity.userdefined;

public class PasswordTooShortException  extends Exception {
	private String msg;
	
	public PasswordTooShortException()
	{
		msg="Entered password is to Short";
	}
	
	public String toString()
	{
		return msg;
	}
	
	public String getMessage()
	{
		return msg;
	}

}
