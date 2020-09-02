package test;
 
public class butterfly implements Animal{
 
	public butterfly() {
		 fly();
		 call();
	}
	public void fly(){
		System.out.println("butterfly can fly");
	}
	@Override
	public void walk() {		 		
	}
	@Override
	public void swim() {		
	}
	 
	@Override
	public void call() {
		System.out.println("does not make a sound");		
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
		return false;
	}
	@Override
	public boolean swimconfirm() {
		return false;
	}
}
