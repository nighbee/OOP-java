package Lab2.problem2;
import java.util.HashSet; 
public class Main {
	public static void main(String[]args) {
		HashSet<Person> ppls= new HashSet<>();
		Person p1= new Person("Ala", 19); 
		Person p2= new Person("Ala", 19); 
		Student s1= new Student("jj ", 20, 299391); 
		Student s2= new Student("ii", 27, 203020); 
		
		ppls.add(p1); 
		ppls.add(s2);
		ppls.add(p2);
		ppls.add(s1);
		
		System.out.println("if p1 equls to p2 : "+ p1.equals(p2)); 
		System.out.println("if p1 equls to s2 : "+ p1.equals(s2)); 
		
		
	}
}
