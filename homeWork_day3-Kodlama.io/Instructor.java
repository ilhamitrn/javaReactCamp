
public class Instructor extends User {
	
	private String insCourseName;
	
	
	public Instructor(String firstName, String lastName, String email, String telNumber, String insCourseName) {
		super(firstName, lastName, email, telNumber);
		this.insCourseName = insCourseName;
	}
	public String getInsCourseName() {
		return insCourseName;
	}
	public void setInsCourseName(String insCourseName) {
		this.insCourseName = insCourseName;
	}

}
