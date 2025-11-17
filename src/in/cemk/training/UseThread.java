package in.cemk.training;

class Info{
	public void display() {
		System.out.println("This is method from the info class");
	}
}

public class UseThread extends Info implements Runnable{
	
	@Override
	public void run() {
		System.out.println("This is the method from the Runnable class implemented in the UseThread class.");
	}

	public static void main(String[] args) {
		
		UseThread useThread = new UseThread();
		
		useThread.display();
		useThread.run();
	}
}
