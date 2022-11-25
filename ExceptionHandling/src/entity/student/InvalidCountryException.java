package entity.student;

public class InvalidCountryException extends Exception {
	
	private String msg;
	public InvalidCountryException()
	{
		msg="User outside India cannnot be registered";
	}
	
	public String toString()
	{
		return msg;
	}
}
