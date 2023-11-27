package lab3;
import java.util.Date; 
import java.util.Vector;
public class Main4 {
	public static void main(String[] args) {
        try {
            // Create employees
            Employee employee1 = new Employee("John Smith", 50000, new Date(), "123-456-789");
            Employee employee2 = new Employee("Jane Doe", 60000, new Date(), "987-654-321");
            
            // Print employees
            System.out.println(employee1);
            System.out.println(employee2);
            
            // Compare employees
            System.out.println("Are employees equal? " + employee1.equals(employee2));
            
            // Clone employee
            Employee clonedEmployee = employee1.clone();
            System.out.println("Cloned employee: " + clonedEmployee);
            
            // Create manager
            Vector<Employee> team = new Vector<>();
            team.add(employee1);
            team.add(employee2);
            Manager manager1 = new Manager("Alice Johnson", 80000,new Date(), "456-789-123", team, 10000);
            
            // Print manager
            System.out.println(manager1);
            
            // Compare manager with employee
            System.out.println("Is manager equal to employee? " + manager1.equals(employee1));
            
            // Compare manager with another manager
            Manager manager2 = new Manager("Bob Smith", 90000, new Date(), "789-123-456", team, 15000);
            System.out.println("Is manager1 equal to manager2? " + manager1.equals(manager2));
            
            // Clone manager
            Manager clonedManager = manager1.clone();
            System.out.println("Cloned manager: " + clonedManager);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

