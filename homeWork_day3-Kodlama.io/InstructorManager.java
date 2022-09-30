
public class InstructorManager extends UserManager {
	
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + "Kullanıcısı " + instructor.getInsCourseName() + " kursuna eklendi");
		System.out.println("Eğitim vereceği kursun adı : " + instructor.getInsCourseName());
	}
}
