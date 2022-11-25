package entity.serialization;



public class Programmer extends Employee {
	double extra_hrs;
	double charge_per_hr;

	public Programmer(String s, int dd, int mm, int yy, int empid, int salary, double eh, double cph) {
		super(s, dd, mm, yy, empid, salary);
		this.extra_hrs = eh;
		this.charge_per_hr = cph;
	}

	public String toString() {
		return super.toString() + "\nExtra Hours:" + extra_hrs + "\nCharges per Hour:" + charge_per_hr;
	}

	public double calcSalary() {
		return salary + (extra_hrs * charge_per_hr);
	}
}
