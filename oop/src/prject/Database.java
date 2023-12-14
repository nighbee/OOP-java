package prject;

public class Database {
 
    private static Database instance = null;

 
    private Database() {
 
    }

 
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

 
    public String getTeacher() {
       
        return "Teacher details";
    }

 
    public String getManager() { return "Manager details"; }
    public String getStudent() { return "Student details"; }
    public String getNews() { return "News details"; }
    public String getCourse() { return "Course details"; }
    public String getMarks() { return "Marks details"; }

   
    public void addCourse() {
   
    }

    public void addTeacher() { }
    public void addStudent()  {}
    public void addManager() {}

    public void deleteCourse() {
      
    }

    
    public void deleteNews() {  }
    public void deleteMessage() { }
    
    public void changePassword() {}

    public void changeEmail() {}

   
    public void viewStudentsSortedByName() {
         }

    public void viewStudentsSortedByGPA() {
           }

    

    public void cleanup() {
           }

    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
