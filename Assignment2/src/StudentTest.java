
public class StudentTest {
	/*Define and implement class StudentTest. This class should implement main() method. 
	 * In the body of the main() method you should create an instance of Student with 
	 * the following information: John Smith, 20 year old, 3.6 gpa, Computer Science major, 
	 * School of Computer Science department. 
	 * You should make an appropriate call and print this student's schedule. 
	 * Save this class and its definition into a file named StudentTest.java.
	 */
	
	public static void main(String args[]) {
		Student j = new Student("John", "Smith", 20, 3.6, "Computer Science", "School of Computer Science");
		Student.Course inner = new Student.Course();
		inner.printSchedule();
		//
	}
}
