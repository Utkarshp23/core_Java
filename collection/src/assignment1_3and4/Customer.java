package assignment1_3and4;

import java.io.Serializable;

public class Customer implements Serializable {
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", cno=" + cno + "]";
	}

	String name;
	String email;
	String cno;
	
	public Customer(String name, String email, String cno) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.email=email;
		this.cno=cno;
	}
}
