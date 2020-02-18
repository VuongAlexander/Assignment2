
public class Employee extends Person{
	
	int id;
	String status; //Contractor, Full Time, Part Time
	String startDate;
	float pay;
	float hourlyPay; //For Part Time and Contractor
	float yearlyPay; //For Full Time
	
	int hours;
	int weeks;
	
	public Employee (int id, String status, String startDate, float pay) {
		super("Joe", "Smith", 23, 663339999, "1 Washington", "Male", 120);
		this.id = id;
		this.status = status;
		this.startDate =startDate;
		this.pay = pay;
	}
	
	public String introduce() {  
		return "Hello! My name is " + firstName + " " + lastName + ". I am a " +
		status + " worker. I started on " + startDate + ".";
	}
	
	public String calculatePay() {
		if(status.equals("Contractor")) {
			getPay();
			return "I work " + hours + " hours. I get paid $" + getPay();
		}
		else if(status.contentEquals("Part Time")) {
			getPay();
			return "I work " + hours + " hours. I get paid $" + getPay();
		}
		else {
			getPay();
			return "I work " + weeks + " weeks. I get paid $" + getPay() ;
		}
	}
	
	public String getPay() {
		if(status.equals("Contractor")){
			hourlyPay = pay;
			return hourlyPay + " per hour.";
		}
		else if(status.equals("Part Time")) {
			hourlyPay = pay;
			return hourlyPay + " per year.";
		}
		else {
			yearlyPay = pay;
			return yearlyPay + " per year.";
		}
	}
	
	//Getters
	public int getID() {
		return id;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getStartDate() {
		return startDate;
	}
}
