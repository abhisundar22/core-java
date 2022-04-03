package multithread;

public class Multi2 extends Thread{
	
	public void run()
	{
	
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread()+" "+i);
		}
	}
	

	public static void main(String[] args) {

		Multi2 m2=new Multi2();
		m2.setName("Thread one");
	//	m2.start();
		//Multi2 m3=new Multi2();
		//m3.start();
		
		m2.run();//not rigt way to call thread
	}

}
