
// This class is about THREADS
public class ThreadsExample {

	//Main method	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//do something
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
						
		// These two Objects are calling my class chair with the for properties
//		Chair c1 = new Chair("Razer", "Black", "Leather", 10);
//		Chair c2 = new Chair(null, null, null, 0);
//		c2.spin();
//		
//		// Behavior
//		System.out.println("Chair 2 is called: " + c2.getName());
	}
}

// Thread created to display message
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






//6. Write a program with three threads
//The first displaying “I am thread one!” every 5 seconds
//The second displaying “I am thread two!” every 10 seconds
//And the last displaying “I am thread three!” every 1 second


// APARTIR DAQUI, NOS APREDEMOS UM POUCO MAIS DE CLASS E PARAMETROS, GET AND SET



//It is used as Interface
//interface MyInterface{
//	void methodExample1();
//	int methodExample2(int exVar);
//}
//
//class ClassExample implements MyInterface{
//
//	@Override
//	public void methodExample1() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public int methodExample2(int exVar) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
//}
//
//class MyThread2 extends Thread{
//	
//}

//Class called chair
class Chair{
	
	// Properties / variables
	private String name;
	private String colour;
	private String material;
	private float size;
	
	// Constructor
	Chair(String n, String c, String m, float s){
		this.name 		= c;
		this.colour 	= c;
		this.material 	= m;
		this.size 		= s;
	}

	// Get and Set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}
	
	// Behaviour
	public void spin() {
		// OTHER CLASS GOES HERE
	}
}