package in.cemk.training;

public class FlowerImplementation implements Flower{
	public void flower() {
		System.out.println("This is the implementation of the flower method from rose and lotus");
	}

	public static void main(String[] args) {
		FlowerImplementation flowerImplent = new FlowerImplementation();
		flowerImplent.flower();
	}

}
