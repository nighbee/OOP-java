package prac3;

public class personTest {
	public static void main(String[]args) { 
		Person p= new Person("Alaz", "Ala"); 
		Student s= new Student("Shit", "ala", "is ", 1, 2500); 
		employee e= new employee("shit2", "ala", "Site", 999);
//		System.out.println(p.getName()); 
//		System.out.println(p.getAddress()); 
		
		System.out.println(p.toString()); 
		System.out.println(s.toString());
		System.out.println(e.toString());
	
	}
}
