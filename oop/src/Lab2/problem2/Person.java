package Lab2.problem2;
import java.util.Objects;

public class Person{
	private  String name; 
	private int age; 
	
	public Person() { 
	}
	
	public Person(String name, int age) { 
		this.name=name; 
		this.age= age; 
	}
	
	public void greeting() { 
		System.out.println("Name: "+ name); 
		System.out.println("Age: "+ age );
	}
	
	public void setName() { 
		this.name= name;
	}
	public void setAge() { 
		this.age= age; 
	}
	public String getName() { 
		return name ;
	}
	public int getAge() { 
		return age; 
	}
	public String toString() { 
		return name+ " "+ age; 
	}
	
	public boolean equals(Object o) { 
		if (this!=o) return false ; 
		if (o == null || getClass() != o.getClass()) return false; 
		Person other = (Person)o; 
		return age== other.age && o.equals(other.name); 
	}
	
	public int hashCode() { 
		return Objects.hash(name ,age);
	}
}
