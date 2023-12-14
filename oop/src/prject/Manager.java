package prject;

public class Manager extends Employee {
    public Manager(String userID, String username, String email, String password) {
		super(userID, username, email, password);
		// TODO Auto-generated constructor stub
	}

	private ManagerType type;

    public void viewInfoStud() {

    }

    public void viewRequest() {

    }

    public void assignCourse() {

    }

    public void createReport() {
    }

}


enum ManagerType {
    OR,
    BASIC
}
