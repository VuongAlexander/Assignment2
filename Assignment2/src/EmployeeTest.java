
public class EmployeeTest {
/*
	Joe Smith, a contractor, pay is $60/hr, should get paid or working 30 hours, other details are up to you
	Lisa Gray, a full time employee, pay is $110,000/yr, should get paid or working 2 weeks, other details are up to you
	Timothy Briggs, a full time employee, pay is $80,000/yr, should get paid or working 4 weeks, other details are up to you
	George Wallace, a part time employee, pay is $20/hr, should get paid or working 25 hours, other details are up to you
	Amy Student, a contractor employee, pay is $45/hr, should get paid or working 45 hours, other details are up to you
 */
	
	public static void main(String args[]) {
		Employee e = new Employee(123, "Contractor", "02/11/2020", 60);
		Employee l = new Employee(223, "Full Time", "01/18/1998", 11000);
		Employee t = new Employee(332, "Full Time", "12/25/2002", 80000);
		Employee g = new Employee(445, "Part Time", "9/11/2001", 20);
		Employee a = new Employee(667, "Contractor", "08/08/2008", 45);
		e.hours = 30;
		System.out.println(e.introduce());
		System.out.println(e.calculatePay());
		System.out.println("\n");
		l.firstName = "Lisa";
		l.lastName = "Gray";
		l.weeks = 2;
		System.out.println(l.introduce());
		System.out.println(l.calculatePay());
		System.out.println("\n");
		t.firstName = "Timothy";
		t.lastName = "Briggs";
		t.weeks = 4;
		System.out.println(t.introduce());
		System.out.println(t.calculatePay());
		System.out.println("\n");
		g.firstName = "George";
		g.lastName = "Walker";
		g.hours = 25;
		System.out.println(g.introduce());
		System.out.println(g.calculatePay());
		System.out.println("\n");
		a.firstName = "Amy";
		a.lastName = "Student";
		a.hours = 45;
		System.out.println(a.introduce());
		System.out.println(a.calculatePay());
		System.out.println("\n");
	}
}
