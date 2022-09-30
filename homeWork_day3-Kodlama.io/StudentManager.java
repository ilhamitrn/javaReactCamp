
public class StudentManager extends UserManager {
	public void add(Student student) {
		//System.out.println(student.getFirstName() + " " + student.getLastName() + "Kullanıcısı eklendi");
		System.out.println(student.getFirstName() + " " + student.getLastName() +  " İsimli Öğrencinin gireceği ders : "+
		student.getStudentCourseName());

	}
}
