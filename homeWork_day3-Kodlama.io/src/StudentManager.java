
public class StudentManager extends UserManager {
	
	public void courseAdd(Student student) {
		System.out.println(student.getFirstName() + " "+ student.getLastName()+ 
		" isimli kullan�c�  \n" + student.getCourse()+ " Kursuna ba�lad�");
	}

}
