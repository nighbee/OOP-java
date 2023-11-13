package prac6;

//Test class
public class Test {
    public static void main(String[] args) {
        // Creating instances
        Cat cat = new Cat("Whiskers", "Persian");
        Person person = new Person("John", 30);
        Student student = new Student("Alice", 20, "S123456");
        
        // Creating restaurant instance
        Restaurant restaurant = new Restaurant();
        
        // Serving pizza and processing payment
        restaurant.servePizza(cat);
        restaurant.processPayment(cat);
        
        restaurant.servePizza(person);
        restaurant.processPayment(person);
        
        restaurant.servePizza(student);
        restaurant.processPayment(student);
        
        // Throwing a party
        cat.throwParty();
        person.throwParty();
        student.throwParty();
        
        // moving 
        cat.move();
        person.move();
        student.move();
        
    }
}