package package_polymorphism;

public class UserClass extends Polymorphism { 	/* Inheriting the class */
	
	public static void main(String[] args) {
		
		UserClass uc = new UserClass(); /* object creation */ 
		
		/* Method calling */
		
		System.out.println( "addition of int and int: "+uc.addition(5, 9)+"\n");
		
		System.out.println("Addition of double and double: "+uc.addition(12.45, 13.78)+"\n");
		
		System.out.println("Addition of int,float, and double: "+uc.addition(20, 15.66f, 78.99)+"\n");
		
		
		
		
		
		
	}

}
