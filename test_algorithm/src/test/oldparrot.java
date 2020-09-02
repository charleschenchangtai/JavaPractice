package test;

public class oldparrot implements Animal {
	public oldparrot() {
		fly();
	}
	@Override
	public void walk() {
		System.out.println("parrot can walk");
		
	}

	@Override
	public void fly() {
		System.out.println("parrot can fly");
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean flyconfirm() {
		return true;
	}
	@Override
	public boolean walkconfirm() {
		return false;
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
