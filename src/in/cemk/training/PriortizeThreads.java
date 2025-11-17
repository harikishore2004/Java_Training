package in.cemk.training;
// Prioritized 

public class PriortizeThreads extends Thread{
	String thname;
	PriortizeThreads(String name){
		thname = name;
	}
	
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println(this.thname + " " + "i: " + i);
		}
	}
	public static void main(String[] args) {
		PriortizeThreads myThread1 = new PriortizeThreads("Th1");
		PriortizeThreads myThread2 = new PriortizeThreads("Th2");
		PriortizeThreads myThread3 = new PriortizeThreads("Th3");
                                                                
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		
		myThread3.setPriority(Thread.MAX_PRIORITY);
		myThread2.setPriority(Thread.NORM_PRIORITY);
		myThread1.setPriority(Thread.MIN_PRIORITY);

		myThread1.start();
		myThread2.start();
		myThread3.start();
	}

}
