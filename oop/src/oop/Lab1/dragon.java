package oop.Lab1;
import java.util.Vector; 


public class dragon {
	private Vector<Person> kidnappedPeople;

    public dragon() {
        kidnappedPeople = new Vector<>();
    }

    public void kidnapPerson(Person person) {
        kidnappedPeople.add(person);
    }

    public boolean willDragonEatOrNot() {
        int boyCount = 0;
        int girlCount = 0;

        for (Person person : kidnappedPeople) {
            if (person.getGender() == Gender.BOY) {
                boyCount++;
            } else {
                girlCount++;

                // proverka na LADYboy poslednego
                if (boyCount > 0) {
                    boyCount--;
                    girlCount--;
                }
            }
        }

        return boyCount + girlCount > 1;
    }
	
}
