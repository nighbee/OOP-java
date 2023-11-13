package prac6; 
//Restaurant class
class Restaurant {
	 public void servePizza(CanHavePizza guest) {
//	     if (guest instanceof Cat) {
//	         System.out.println("Cats eat for free!");
//	         guest.eatPizza();
//	     } else if (guest instanceof Student) {
//	         System.out.println("The student gets a discounted price of $2.");
//	         guest.eatPizza();
//	     } else if (guest instanceof Person) {
//	         System.out.println("The person needs to pay the full price of $3.");
//	         guest.eatPizza();
//	     } else {
//	         System.out.println("Invalid guest. Cannot serve pizza!");
//	     }
		 guest.eatPizza();
	 }
	 
	 public void processPayment(CanHavePizza guest) {
	     if (guest instanceof Cat) {
	         System.out.println("No payment required.");
	     } else if (guest instanceof Student) {
	         System.out.println("Payment processed: $2");
	     } else if (guest instanceof Person) {
	         System.out.println("Payment processed: $3");
	     } else {
	         System.out.println("Invalid guest. Cannot process payment!");
	     }
	 }
}
