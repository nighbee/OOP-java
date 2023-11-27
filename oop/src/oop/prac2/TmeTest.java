package oop.prac2;

public class TmeTest {
	public static void main(String[]args) { 
		Time t = new Time (23,5,6); 
		System.out.println(t.toUniversal());
		System.out.println(t.toStandart()); 
		Time t2 = new Time(4,24,33); 
		t.add(t2);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandart()); 
	}
}
