package prac6;  
//Cat class
class Cat implements CanHavePizza, CanHaveParty, Move  {
	 private String name;
	 private String type;
	 
	 public Cat(String name, String type) {
	     this.name = name;
	     this.type = type;
	 }
	 
	 public String getName() {
	     return name;
	 }
	 
	 public void setName(String name) {
		this.name = name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
	     return type;
	 }
	 
	@Override 
	 public void eatPizza() {
	     System.out.println("The cat named " + name + " is enjoying the pizza.");
	 }
	@Override 
	public void throwParty() {
        System.out.println("The cat named " + name + " is throwing a party!");
    }
	
	@Override
	public void move(){
        System.out.println("The cat named " + name + " moves slowly.");
    }
}
