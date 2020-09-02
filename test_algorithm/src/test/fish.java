package test;

public class fish implements Animal {
	
	public fish() {
		walk();
		sing();
	}
	@Override
	public void walk() {
		System.out.println("Fishes don¡¦t walk");
	}
	public void sing() {
		System.out.println("Fishes don¡¦t sing");
	}
	@Override
	public void fly() {		
	}
	@Override
	public void swim() {
		System.out.println("Fishes can swim");
		
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
