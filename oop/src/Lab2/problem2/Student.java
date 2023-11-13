package Lab2.problem2;

public class Student extends Person{
	private int id; 
	public Student() { 
	}
	public Student(String name, int age, int id) { 
		super(name, age); 
		this.id = id ;
	}
	
	public void setId() { 
		this.id= id; 
	}
	
	public int getId() { 
		return id; 
	}
	
	@Override
	public void  greeting() { 
		super.greeting(); 
		System.out.println("Id: "+id); 
	}
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return id== student.id;
    }

}
