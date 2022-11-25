package entity;

public class Customer {
	
	String email;
	String address;
	
	public Customer(String string, String string2) {
		// TODO Auto-generated constructor stub
		email=string;
		address=string2;
	}

	public float giveDiscount(int sp) {
		return sp;
	}
}
