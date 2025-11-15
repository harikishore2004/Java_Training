package in.cemk.training;

public class ImplementFullAbstractClass extends AbstactClass{
	
	public void multiplication(int x, int y) {
		System.out.println("Multiplication: "+ (x*y));
	}
	public void division(int x, int y) {
		System.out.println("Division: " + (x/y));
	}
	
	public static void main(String[] args) {
		
		ImplementFullAbstractClass obj = new ImplementFullAbstractClass();
		
		obj.addition(10, 20);
		obj.subtraction(80, 50);
		obj.multiplication(10, 10);
		obj.division(200, 2);
	}
}
