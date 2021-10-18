
// This class is about THREADS
public class ThreadsExample {

	//Main method	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Do something
		//System.out.println("Hello World");
		
		System.out.println("Thread's Time:");
		MyThread thread1 = new MyThread("I am thread one", 5000);
		MyThread thread2 = new MyThread("I am thread two", 10000);
		MyThread thread3 = new MyThread("I am thread three!", 1000);
		
		// Objects
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		t1.start();
		t2.start();
		t3.start();
	}
}

// Class created to display message
class MyThread implements Runnable{
	
	private String message;
	private int time;
	
	//Constructor
	MyThread(String message, int time){
		this.message = message;
		this.time = time;
	}
		
	@Override
	public void run() {
		
		// Thread's task goes here
		for (;;) {
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				return;
			}
			System.out.println(" Thread " + message + " executing in " + time / 1000 + "seconds");
		}
	}
}
