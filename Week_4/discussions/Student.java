/* Author: James Bowens
*  Date: September 13, 2016
*  Purpose: To create a unique java class
*/

public class Student {
	
	// Declare variables
	private int studentId;
	private String firstName;
	private String lastName;

	// Construtor used to create objects
	public Student(int studentId, String firstName, String lastName) {
		this.setStudentId(studentId);
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
	// Getter and Setter methods used to access private fields
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
	
	