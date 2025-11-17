package in.cemk.training;

class A extends Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Thread A" + " " + "i: " + i);
		}
	}
}

class B extends Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			if (i == 2) {
				try {
					System.out.println("Thread B is sleeping for 5 sec");
					sleep(5000);
				}
				catch(InterruptedException  e) {
					e.printStackTrace();
				}
			}
			System.out.println("Thread B" + " " + "i: " + i);
		}
	}
}

class C extends Thread{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Thread C" + " " + "i: " + i);
		}
	}
}

public class ThreadControl {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		a.start();
		b.start();
		c.start();
	}
}
