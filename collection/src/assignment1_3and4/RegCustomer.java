package assignment1_3and4;

public class RegCustomer extends Customer {
	
	
	int reg_no;
	
	public RegCustomer(String name, String email, String cno) {
		// TODO Auto-generated constructor stub
		super(name,email,cno);
	}

	public RegCustomer(String name, String email, String cno, int reg_no2) {
		// TODO Auto-generated constructor stub
		super(name,email,cno);
		reg_no=reg_no2;
	}



	@Override
	public String toString() {
		return "RegCustomer [reg_no=" + reg_no + ", name=" + name + ", email=" + email + ", cno=" + cno + "]";
	}



}
