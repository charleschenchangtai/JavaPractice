package test;

public class duck implements Animal{	
	public duck() {
		call();
		swim();
	}
	@Override
	public void call() {
		System.out.println("A duck says: Quack,quack...");		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fly() {
		System.out.println("A duck can fly");
		
	}
	@Override
	public void swim() {
		System.out.println("A duck can swim");		
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
		return false;
	}
	@Override
	public boolean swimconfirm() {
		return true;
	}	
}
