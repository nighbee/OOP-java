package lab3;
import oop.prac2.*;

public class Chocolate implements Comparable<Chocolate>{
	private  String name;
	private double weight;
	
	public Chocolate() {}
	
	public Chocolate( double weight, String name) { 
		this.name=name; 
		this.weight= weight; 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(Chocolate other) {
		// TODO Auto-generated method stub
		return Double.compare(this.weight, other.weight);
	}

	@Override
	public String toString() {
		return "name=" + name + ", weight=" + weight;
	} 
	
	
}
