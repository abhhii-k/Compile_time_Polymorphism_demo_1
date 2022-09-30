package package_polymorphism;

public class Polymorphism {
	
	/* CompileTime Polymorphism is example of method over loading
	 * : it's also called as Early Binding 
	 * : Here Compile will decide the which method should execute*/
	
	/* Method Overloading is In same class having same name with multiple 
	 * methods and difference in there arguments is called Method overloading */

	public int addition(int a, int b) { 		/* arguments int,int */
		return a+b;
	}
	
	public double addition(double a, double b) {   /* arguments double,double */
		return a+b;
	}
	
	public double addition(int a, float b, double c) {   /* arguments int,float,double */
		return a+b+c;
	}
}
