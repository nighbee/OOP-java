package prac3;
import java.util.Vector;
class Person {
	private String name; 
	private String address; 
	private static Vector<Person> people = new Vector<>(); 
	
	{ 
//		System.out.println("Initializing"); 
	}
	
	
	public Person() { 
		// defo const 
	}
	public Person(String name, String address) { 
		this.name= name; 
		this.address=address; 
	}
	
	
	public void setName() { 
		this.name= name; 
	}
	
	public void setAddress(){ 
		this.address= address ; 
	}
	
	public String getName() { 
		return name; 
	}
	
	public String getAddress() { 
		return address; 
	}
	
	public static void addPerson(Person person) { 
		people.add(person);
	}
	public static Vector<Person> getPeople(){ 
		return people; 
	}
	
	public String toString() { 
		return "Person " + name + " Address "+ address; 
	}
	
}
