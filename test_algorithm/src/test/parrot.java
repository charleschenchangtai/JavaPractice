package test;

public class parrot {
	 public static void main(String[] args)
	    {
	        Category category=new Category();	         
	        category.birdparrot(new parrotdog()); 
	        category.birdparrot(new parrotcats());
	        category.birdparrot(new parrotrooster());
	        category.birdparrot(new parrotdock());
	        category.birdparrot(new parrotphone());
	    }
	}
	 
	interface parrotcalls{
	    public String call();  
	}
	 
	class parrotdog implements parrotcalls{
	    public String call(){
	        return "Woof, woof¡K¡K"; 
	    } 
	}
	 
	class parrotcats implements parrotcalls{
	    public String call(){
	        return "Meow¡K¡K"; 
	    }
	} 
	class parrotrooster implements parrotcalls{
	    public String call(){
	        return "Cock-a-doodle-doo¡K¡K"; 
	    }
	}
	class parrotdock implements parrotcalls{
		public String call() {
			return "Quack, quack...";
		}
	}	 
	class parrotphone implements parrotcalls{
		public String call() {
			return "Ring ring...";
		}
	}
	class Category{
	    public void birdparrot(parrotcalls parrotcalls){	         
	        System.out.println(parrotcalls.call()); 
	    }
	}

 
