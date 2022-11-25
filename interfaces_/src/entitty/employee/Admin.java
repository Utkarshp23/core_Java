package entitty.employee;

import entity.Employee;

public class Admin extends Employee {
	double bonus;

	public Admin(String s, int dd, int mm, int yy, int empid, int salary, double bonus) {
		super(s, dd, mm, yy, empid, salary);
		this.bonus = bonus;

	}

	public String toString() {
		return super.toString() + "\nBonus:" + bonus;
	}

	public double calcSalary() {
		return salary + bonus;
	}
}
