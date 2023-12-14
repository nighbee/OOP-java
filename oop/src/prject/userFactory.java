package prject;

public class userFactory {
	 public static User createUser(String userID, String username, String email, String password) { 
		 return new User(userID, username, email, password); 
	 }
}
