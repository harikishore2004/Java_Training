package in.cemk.training;

public class UserDefinedExceptions extends Exception{
	UserDefinedExceptions(String message){
		super(message);
	}

	public static void main(String[] args) {
		int x = 100;
		int y = 20;
		try {
			if(x<y) {
				System.out.println("x is less then y");
			}
			else {
				throw new UserDefinedExceptions("X is Greater then Y");
			}		
		} 
		
		catch (UserDefinedExceptions e) {
			System.out.println("User defined exeption occured");
			System.out.println("Detailed error is: " + e.getMessage());
		}

	}

}
