
public class StudentManager extends UserManager {
	
	public void courseAdd(Student student) {
		System.out.println(student.getFirstName() + " "+ student.getLastName()+ 
		" isimli kullanıcı  \n" + student.getCourse()+ " Kursuna başladı");
	}

}
