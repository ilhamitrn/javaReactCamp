
public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("ahmet", "başaran", "abasaran@gmail.com",
				"05458765412", "İngilizce");
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		
		Instructor instructor1 = new Instructor("ilhami", "turan", "ituran@gmail.com", "05437544212", "Algoritma ve Programlama");
		instructorManager.add(instructor1);
		
		

	}

}
