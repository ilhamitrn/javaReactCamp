
public class Instructor extends User {

	private int instructorId;
	private String courseName;
	
	public Instructor() {
		
	}
	
	public Instructor(int id,String firstName, String lastName,int instructorId, String courseName) {
		super();
		this.instructorId = instructorId;
		this.courseName = courseName;
	}
	
	
	public int getInstructorId() {
		return instructorId;
	}
	public String getCourseName() {
		return courseName;
	}

	

	
	
	
}
