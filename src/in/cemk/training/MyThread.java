package in.cemk.training;

// Thread Hierarchy   Runnable -> Thread(implements) -> MyThread(extends)
public class MyThread extends Thread{
	String thname;
	MyThread(String name){
		thname = name;
	}
	
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println(this.thname + " " + "i: " + i);
		}
	}

	public static void main(String[] args){
		MyThread myThread1 = new MyThread("Th1");
		MyThread myThread2 = new MyThread("Th2");
		MyThread myThread3 = new MyThread("Th3");
		
		myThread1.start();
		myThread2.start();
		myThread3.start();
	}

}
