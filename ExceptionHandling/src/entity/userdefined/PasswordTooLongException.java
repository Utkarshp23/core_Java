package entity.userdefined;

public class PasswordTooLongException extends Exception {
	private String msg;

	public PasswordTooLongException()
	{
		msg="Entered password is to Long";
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
