package oop;

public class fifth {
	private double balance;
	private double interest;
	    public fifth(double interest, double balance){
	        this.interest= interest;
	        this.balance=balance;
	    }
	    public void addInterest(){
	        double amount=balance * (interest/100);
	        balance+= amount;
	    }

	    public double getBalance() {
	        return balance;
	    }
}
