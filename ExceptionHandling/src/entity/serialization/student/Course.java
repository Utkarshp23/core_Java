package entity.serialization.student;

import java.io.Serializable;

public class Course implements Serializable {
	private String cname;
	private int cid;
	private double cfees;
	
	public Course(String cname, int cid, double cfees) {
		super();
		this.cname = cname;
		this.cid = cid;
		this.cfees = cfees;
	}

	@Override
	public String toString() {
		return "Course [cname=" + cname + ", cid=" + cid + ", cfees=" + cfees + "]";
	}
	 
	
	
}
