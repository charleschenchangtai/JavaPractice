package test;

public class Shark implements Animal {
	public Shark() {
		swim();
		feature();
		hobbits();
	}
	private String feature() {			 
		return "Sharks are large and grey...";
	}
	private String hobbits() {		 
		return "Sharks eat other fish...";
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
		// TODO Auto-generated method stub
		
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
