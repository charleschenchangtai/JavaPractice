package test;

public class dolphin implements Animal {
	public dolphin() {
		swim();
	}

	@Override
	public void walk() {				
	}

	@Override
	public void fly() {	
	}

	@Override
	public void swim() {
		System.out.println("dolphin can swim");
		
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
		return true;
	}

	@Override
	public boolean swimconfirm() {
		return true;
	}

  
}
