
public class Person{
/*
 * This class should also overload implementation of toString() method and 
 * implement new method named introduce(), which will display this person's 
 * attribute values to the command line. Save this class and its definition 
 * into a file named Person.java.
 */
	String firstName;
	String lastName;
	int age;
	int ssn;
	String address;
	String gender;
	float weight;
	
	public Person(String firstName, String lastName, int age, int ssn, String address, String gender, float weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ssn = ssn;
		this.address = address;
		this.gender = gender;
		this.weight = weight;
	}
	
	public String toString() {
		return firstName + " " + lastName + " " + age
				+ " " + ssn + " " + address + " " + gender + " " + weight;
	}
	
	public String introduce() {
		return toString();
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
	
	public int getSSN() {
		return ssn;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getGender() {
		return gender;
	}
	
	public float getWeight() {
		return weight;
	}
}
