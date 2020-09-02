package test;

public class caterpillar implements Animal {
	public caterpillar() {
		 walk();
		 fly();
	}
	@Override
	public void walk() {
		System.out.println("can walk");		
	}

	@Override
	public void fly() {
		System.out.println("can not fly(crawl)");		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub		
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
		return true;
	}
	@Override
	public boolean singconfirm() {
		return false;
	}
	@Override
	public boolean swimconfirm() {
		return false;
	}
}
