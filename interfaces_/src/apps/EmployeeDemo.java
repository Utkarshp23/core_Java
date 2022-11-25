package apps;

//import entity.*;
import entity.Employee;
import entity.ITraveller;
import entity.Person;
import entitty.employee.Admin;
import entitty.employee.Programmer;
import entitty.employee.SalesManager;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee [] e= {
				new SalesManager("Rahul",23,4,2000,1001,10000,15000,4.5,5),
				new Programmer("Keshav",13,2,1996,1002,50000,50,1000,6),
				new Admin("Krishna",23,4,2000,1003,10000,5000)
				};
		
		for(Employee d: e)
		{
			System.out.println(d);//d.toString();
			System.out.println("------------------------------");
		}
		
		System.out.println("Total Salaries:");
		for(Employee d:e)
		{
			System.out.println("Employee<"+d.getEmpid()+"> : "+d.calcSalary());
			if(d instanceof ITraveller && d instanceof SalesManager)
			{
				System.out.println("No. of days travelled:"+((SalesManager)d).getNd() +"\nTotal Travell Allowance:"+((ITraveller)d).calculateTA());
			}
			if(d instanceof ITraveller && d instanceof Programmer)
			{
				System.out.println("No. of days travelled:"+((Programmer)d).getNd()+"\nTotal Travell Allowance:"+((ITraveller)d).calculateTA());
			}
			System.out.println("_____________________________________");
		}
		System.out.println("--------------------------------------------------------");
	}

}
