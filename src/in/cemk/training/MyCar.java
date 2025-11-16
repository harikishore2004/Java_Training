package in.cemk.training;

public class MyCar extends Suzuki{
	
	public void car() {
		System.out.println("This the over rided method of the Suzuki class");
	}
	public static void main(String[] args) {
		MyCar myCar = new MyCar();
		myCar.car();
		
	}

}
