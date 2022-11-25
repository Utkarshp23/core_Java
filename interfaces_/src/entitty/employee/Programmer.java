package entitty.employee;

import entity.Employee;
import entity.ITraveller;

public class Programmer extends Employee implements ITraveller {
	double extra_hrs;
	double charge_per_hr;
	private int nd;

	public int getNd() {
		return nd;
	}

	public Programmer(String s, int dd, int mm, int yy, int empid, int salary, double eh, double cph,int n) {
		super(s, dd, mm, yy, empid, salary);
		this.extra_hrs = eh;
		this.charge_per_hr = cph;
		this.nd=n;
	}

	public String toString() {
		return super.toString() + "\nExtra Hours:" + extra_hrs + "\nCharges per Hour:" + charge_per_hr;
	}

	public double calcSalary() {
		return salary + (extra_hrs * charge_per_hr);
	}
	
	public double calculateTA()
	{
		return  (double)(salary*DA/100)*nd;
	}
}
