package prject;
enum TeacherDegree{ 
	TUTOR, BASIC, LECTOR	
}

public class Teacher extends Employee {
   

	private TeacherDegree degree;
	
	 public Teacher(String userID, String username, String email, String password) {
			super(userID, username, email, password);
			this.degree=degree; 
			
		}
	
    public void viewSchedule() {
     
    }

    public boolean headCourse() {
    
        return false; 
    }

    public void putMark(Integer mark) {
        }

    public void deleteMark(Integer mark) {
        }

    
}
