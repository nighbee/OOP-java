package prac3;

public class animalTest {
	public static void main(String[]args) { 
		animal animal = new animal(" generic animal"); 
		Dog dog = new Dog("Max", "Jai"); 
		
		animal.makeSound();// output: Animal makes sound
		dog.makeSound();// output: bark bark 
		
		animal.eat("meat"); // output: animal eating meat
		dog.eat("pedigree");// output: dog eating pedigree
		
		dog.makeSound(3); // woof woof woof 
	}
}
