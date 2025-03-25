package _01_Class_25Mar2025;

public class Test {

	//Instance variable
	int a = 10;
	
	//static variable
	static int b = 20; // it will access in static and non-static methods both 
	

	public static void main(String[] args) {
		Test t = new Test(); // we will create object if variable  is not static
		System.out.println(t.a);
		
		System.out.println(b);
		
		//Local Variable :- it can be access only with in the class
		int c = 40;
		System.out.println(c);
		
		Employee emp = new Employee(); // Reference type variable
		
	}
	
	public void methodOne() {
		System.out.println(a);
		System.out.println(b);
		
		int c = 50;
		System.out.println(c);
	}
	

}
