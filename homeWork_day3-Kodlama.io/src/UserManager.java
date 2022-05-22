
public class UserManager {
	
	public void login(User user) {
		System.out.println(user.getFirstName() + " "+ user.getLastName()  + " Giriþ yaptý");
	}
	
	public void logOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Çýkýþ yaptý");
	}

}
