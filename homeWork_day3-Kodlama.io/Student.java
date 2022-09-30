
public class Student extends User {
	
	private String studentCourseName;


	public Student(String firstName, String lastName, String email, String telNumber, String studentCourseName) {
		super(firstName, lastName, email, telNumber);
		this.studentCourseName = studentCourseName;
	}

	public String getStudentCourseName() {
		return studentCourseName;
	}

	public void setStudentCourseName(String studentCourseName) {
		this.studentCourseName = studentCourseName;
	}
	
}
