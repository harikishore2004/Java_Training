package in.cemk.training;

public class TryCatch {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		try{
			int z = x/y;
		}
		
		catch(ArithmeticException ae) {
			System.out.println("Arithmatic excp occured");
			System.out.println("The exact error is: " + ae.getMessage());
		}	
		catch (Exception e) {
			System.out.println("Unhadeled excp occured");
		}

	}

}
