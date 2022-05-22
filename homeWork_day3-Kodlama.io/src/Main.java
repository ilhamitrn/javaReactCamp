
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserManager userManager = new UserManager();
		 
		Student student = new Student();
        student.setFirstName("ilhami");
        student.setLastName("turan");
        student.setEmail("ituran@hotmail.com");
        student.setCourse("c#");
        

        userManager.login(student);

        StudentManager studentManager = new StudentManager();
        studentManager.courseAdd(student);
        
        

        Instructor instructor = new Instructor();
        instructor.setId(45662);
        instructor.setFirstName("ahmet");
        instructor.setLastName("sayar");
        instructor.setEmail("ahmetsayar@gmail.com");
        instructor.setId(0);
        


       userManager.logOut(student);

		

	}

}
