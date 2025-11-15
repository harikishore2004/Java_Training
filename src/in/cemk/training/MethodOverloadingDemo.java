package in.cemk.training;
public class MethodOverloadingDemo {
	
	public static double area(int length, int breadth) {
		return length * breadth;
	}
	
	public static double area(float side) {
		return side * side;
	}
	
	public static double area(int radius) {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		
		int length = 10;
		int width = 20;
		float side = 10.0F;
		int radius = 10;
		
		System.out.println("Area of the rectangle is: " + area(length, width));
		System.out.println("Area of the square is: " + area(side));
		System.out.println("Area of the circle is: " + area(radius));
		
	}

}
