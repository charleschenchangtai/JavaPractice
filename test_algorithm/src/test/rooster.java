package test;

public class rooster extends chicken {

	public rooster() {
		call();
	}
	@Override
	public void call() {
		 System.out.println("Cock-a-doodle-doo");		
	}
 
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fly() {
		System.out.println("I can not fly");
		
	}
	@Override
	public void swim() {
		System.out.println("I can swim");		
	}
	 
 
 
 
}
