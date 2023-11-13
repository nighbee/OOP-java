package Lab2.problem4;

public class Savings extends Account {
	private double interestRate; 
	
	
	public Savings( int accNumber, double interestRate) { 
		super(accNumber); 
		this.interestRate=interestRate; 
	}
	
	public void addInterest() { 
		double interest= getBalance()* interestRate*100;
		deposit(interest); 
	}
	
}
