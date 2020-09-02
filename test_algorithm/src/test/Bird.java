package test;

public class Bird implements Animal{	
	public boolean flyconfirm() {
		return true;
	};
	public Bird() {
		 walk();	 
  		 fly();
		 sing();
	}
	public void fly() {
			System.out.println("Bird is flying"); 
		 
	}
	public void sing() {
		System.out.println("Bird is Singing....");
	}
	@Override
	public void walk() {
		System.out.println("Bird can't walk....");
	}
	@Override
	public void swim() {				
	}
	@Override
	public void call() {		
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
