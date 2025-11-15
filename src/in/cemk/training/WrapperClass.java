package in.cemk.training;

public class WrapperClass {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("X: " + x);
		
		
//		Integer y = new Integer(x); 
		Integer y = x; //Auto boxing
		
//		int z = Integer.valueOf(y);
		int z = y;  // Out boxing
		
		System.out.println("Z: "+ z);
		
		float val = 10.0F;
		double data = 20.00D;
		
		Float wrapperVal = val; // Auto boxing
		Double wrapperData = data;
		
		System.out.println("Wrapper value: " + wrapperVal);
		System.out.println("Wrapper data: " + wrapperData);
	}

}
