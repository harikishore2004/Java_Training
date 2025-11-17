package in.cemk.training;

public class ThreadSynchroniaztion extends Thread{
	
	// This the synchronized method
	public synchronized void display() {
		
		System.out.println("This is the synchronized method.");
		try {
			sleep(2000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void show() {
		int x = 10;
		int y = 20;
		synchronized (this) {
			int z = y/x;
			System.out.println("This the synchronized bolb.");
		}
	}
	public static void main(String[] args) {
		ThreadSynchroniaztion obj1 = new ThreadSynchroniaztion();
		obj1.display();
			
		ThreadSynchroniaztion obj2 = new ThreadSynchroniaztion();
		obj2.display();
		
		ThreadSynchroniaztion obj3 = new ThreadSynchroniaztion();
		obj3.display();
		
		obj1.show();
		obj2.show();
		obj3.show();

	}

}
