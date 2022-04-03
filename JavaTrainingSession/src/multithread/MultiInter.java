package multithread;

public class MultiInter implements Runnable{

	public void run() {
		
		System.out.println("thread is running");
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiInter m1=new MultiInter();
		Thread t1=new Thread(m1);
		t1.start();
		//t1.start();

	}

	
	

}
