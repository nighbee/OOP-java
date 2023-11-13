package prac6;

// Person class
class Person implements CanHavePizza, CanHaveParty, Move {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
    public void eatPizza() {
        System.out.println("The person named " + name + " is enjoying the pizza.");
    }
	
	@Override
	public void throwParty() {
        System.out.println("The person named " + name + " is throwing a party!");
    }
	@Override 
	public void move() {
        System.out.println("The person named " + name + " moves at a normal pace.");
    }
}