package test;

public class chicken implements Animal{
	public chicken() {		
		call();
	}
	@Override
	public void call() {
		System.out.println("A chicken says: Cluck,cluck...");		
	}

	@Override
	public void walk() {	
		System.out.println("chicken can walk");
	}
	 
	@Override
	public void swim() {		
	}
	@Override
	public void fly() {	 
		System.out.println("A chicken cannot fly");	
	}
	@Override
	public boolean flyconfirm() {
		return false;
	}
	@Override
	public boolean walkconfirm() {
		return true;
	}
	@Override
	public boolean singconfirm() {
		return true;
	}
	@Override
	public boolean swimconfirm() {
		return false;
	}
}
