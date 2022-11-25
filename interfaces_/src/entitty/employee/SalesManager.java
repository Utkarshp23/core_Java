package entitty.employee;

import entity.Employee;
import entity.ITraveller;

public class SalesManager extends Employee implements ITraveller {
	double target;
	double incentive;
	private int nd;

	public int getNd() {
		return nd;
	}

	
	public SalesManager(String s, int dd, int mm, int yy, int empid, int salary, double target, double incentive,int n) {
		super(s, dd, mm, yy, empid, salary);
		this.target = target;
		this.incentive = incentive;
		this.nd=n;
	}

	public String toString() {
		return super.toString() + "\nTarget:" + target + "\nIncentive:" + incentive;
	}

	public double calcSalary() {
		return salary + target * incentive / 100;
	}
	
	public double calculateTA()
	{
		return (double)(salary*DA/100)*nd;
	}
}
