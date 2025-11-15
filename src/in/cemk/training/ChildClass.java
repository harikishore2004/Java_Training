package in.cemk.training;

public class ChildClass extends SubClass{
	public void work() {
		System.out.println("This is the Child Class");
	}
	
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		
		childClass.show();
		childClass.display();
		childClass.work();
		
	}
}
