package user;

public class User_factory {
	public static USer getUser(String type) { 
		if (type.equals("Student" )) { 
			return new Student; 
		}
		else if (type.equals("Manager" )) { 
			return new Manager; 
		}
		else if (type.equals("Teacher" )) { 
			return new Teacher; 
		}
		else if (type.equals("Dean" )) { 
			return new Dean; 
		}
		return null; 
	}
}
