package oop.prac2;

public class TmeTest {
	public static void main(String[]args) { 
		Tme t = new Tme (23,5,6); 
		System.out.println(t.toUniversal());
		System.out.println(t.toStandart()); 
		Tme t2 = new Tme(4,24,33); 
		t.add(t2);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandart()); 
	}
}
