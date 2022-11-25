package entity.employee;

import entity.Employee;

public class SalesManager extends Employee {
	double target;
	double incentive;

	public SalesManager(String s, int dd, int mm, int yy, int empid, int salary, double target, double incentive) {
		super(s, dd, mm, yy, empid, salary);
		this.target = target;
		this.incentive = incentive;
	}

	public String toString() {
		return super.toString() + "\nTarget:" + target + "\nIncentive:" + incentive;
	}

	public double calcSalary() {
		return salary + target * incentive / 100;
	}
}
