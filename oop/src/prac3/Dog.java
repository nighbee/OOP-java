package prac3;

class Dog extends animal{
	private String breed; 
	public Dog(String name, String breed) { 
		super(name); 
		this.breed=breed; 
	}
	
	@Override 
	public void makeSound() { 
		System.out.println("Bark bark"); 
	}
	public void makeSound(int times) { 
		for (int i =0; i< times; i++) { 
			System.out.println("Woof"); 
		}
	}
	
	@Override 
	public void eat(String food) { 
		super.eat(food);
		System.out.println("Dog is eating pedigree");
	}
	

}
