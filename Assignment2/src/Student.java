
public class Student {
	/*Define and implement class Student. 
	 * Within class Student implement a nested non-static inner class called Course. 
	 * This class should print out the student's course schedule to command line 
	 * via method called printSchedule(). 
	 * This student's schedule is up to your implementation. 
	 */
	
	String firstName;
	String lastName;
	int age;
	double gpa;
	String major;
	String department;
	
	public Student(String firstName, String lastName, int age, double gpa, String major, String department) {
	}
	
	static class Course{
		public void printSchedule() {
			System.out.println("1. CS151"); 
			System.out.println("2. CMPE131");
			System.out.println("3. CS149");
			System.out.println("4. CMPE102");
			System.out.println("5. ENGR100W");
		}
	}
	
	//Getters
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getGPA() {
		return gpa;
	}
	
	public String getMajor() {
		return major;
	}
	
	public String getDepartment() {
		return department;
	}
	
	//Setters
	public String setFirstName(String newFirstName) {
		return this.firstName = newFirstName;
	}
	
	public String setLasttName(String newLastName) {
		return this.firstName = newLastName;
	}
	
	public int setAge(int newAge) {
		return this.age = newAge;
	}
	
	public double setGPA(double newGPA) {
		return this.gpa = newGPA;
	}
	
	public String setMajor(String newMajor) {
		return this.major = newMajor;
	}
	
	public String setDepartment(String newDepartment) {
		return this.department = newDepartment;
	}
}
