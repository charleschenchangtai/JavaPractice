package test;

public class Clownfish implements Animal{
	public Clownfish() {
		swim();
		feature();
		hobbits();
	}
	private String feature() {			 
		return "Clownfish are small and colourful (orange)...";
	}
	private String hobbits() {		 
		return "Clownfish make jokes...";
	}	
	@Override
	public void walk() {	
	}
	@Override
	public void fly() {	
	}
	@Override
	public void swim() {
		System.out.println("Shark can swim");		
	}
	@Override
	public void call() {	
	}
	@Override
	public boolean flyconfirm() {
		return false;
	}
	@Override
	public boolean walkconfirm() {
		return false;
	}
	@Override
	public boolean singconfirm() {
		return false;
	}
	@Override
	public boolean swimconfirm() {
		return true;
	}
}
