package test;

import java.util.ArrayList;
public class Solution {
	public static void main(String[] args) {
		int flycount=0;
		int walkcount=0;
		int singcount=0;
		int swimcount=0;
		ArrayList<Animal> animals = new ArrayList<Animal>(); 
		animals.add(new Bird()); 
 		animals.add(new duck());
 		animals.add(new chicken()); 
 		animals.add(new rooster());
 	    animals.add(new fish());
 	    animals.add(new Shark());
 		animals.add(new oldparrot());
 		animals.add(new Clownfish());
 		animals.add(new dolphin());
 		animals.add(new Frog());
 		animals.add(new Dog());
 		animals.add(new butterfly());
 		animals.add(new cat()); 	 
		System.out.println(animals);
		for(Animal ani:animals) {
			if(ani.flyconfirm()) {
				flycount++;
			}		 
		}
		for(Animal ani:animals) {
			if(ani.walkconfirm()) {
				walkcount++;
			}	 
		}
		for(Animal ani:animals) {
			if(ani.singconfirm()) {
				singcount++;
			}
		}
		for(Animal ani:animals) {
			if(ani.swimconfirm()) {
				swimcount++;
			}
		}		 
		System.out.println("There are "+flycount+" animals can fly.");
 		System.out.println("There are "+walkcount+" animals can walk.");
 		System.out.println("There are "+singcount+" animals can sing.");
 		System.out.println("There are "+swimcount+" animals can swim.");		 
	}
}
