package oop.Lab1;
import java.util.Vector;

public class dragonTest {
	public static void main(String[] args) {
        dragonTest dragonLaunch = new dragonTest();

        // Create the line of people
        Person b1 = new Person(Gender.BOY);
        Person b2 = new Person(Gender.BOY);
        Person g1 = new Person(Gender.GIRL);
        Person g2 = new Person(Gender.GIRL);

        // Kidnap the people
        dragonLaunch.kidnap(b1);
        dragonLaunch.kidnap(b2);
        dragonLaunch.kidnap(g1);
        dragonLaunch.kidnap(g2);

        // Check if the dragon will eat or not
        boolean willEat = dragonLaunch.willDragonEatOrNot();
        System.out.println("Will the dragon eat? " + (willEat ? "Yes" : "No"));
    }
}
