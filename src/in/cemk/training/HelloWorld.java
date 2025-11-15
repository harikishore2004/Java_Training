package in.cemk.training;

public class HelloWorld {
	
	HelloWorld(){ //Constructor
		System.out.println("Java Constructor");
	}
	int x = 10;
	
	static int y = 20;
	
	public void show() { // Non Constructor
		
	}
	public static void main(String args[]) {
		HelloWorld helloWorld = new HelloWorld();
		
		System.out.println("Hello World !!");
		System.out.println("X(Non Static Vaiable) = " + helloWorld.x); // should be accessed using the object variable
		System.out.println("Y(Static Variable) = "+ y); //
		// Non static variables, methods are always accessed using the object of the class
	}
}
