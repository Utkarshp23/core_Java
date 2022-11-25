package entity.name;

public class CustomalyDefinedException extends Exception {
	
	private String msg;

	public CustomalyDefinedException() {
		super();
		this.msg ="name is not valid";
	}
	
	public String toString()
	{
		return msg;
	}
	
	
	

}
