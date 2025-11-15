package in.cemk.training;

public abstract class AbstactClass implements Interface{
	
	public void addition(int x, int y) {
		System.out.println("Addition: " + (x+y));
	}
	public void subtraction(int x, int y) {
		System.out.println("Substraction: " + (x-y));
	}
	public abstract void multiplication(int x, int y);
	
	public abstract void division(int x, int y);
}
