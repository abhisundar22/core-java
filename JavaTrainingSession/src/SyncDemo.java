
class Table
{
	
	
	synchronized void print(int n)
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println(n*i);
		
		try{
			Thread.sleep(1000);
		}catch(Exception e)
		{
			
		}
		
		}
	}
	
}

class ThreadOne extends Thread
{
	Table t;
	
	ThreadOne(Table t)
	{
		this.t= t;
	}
	
	public void run()
	{
		t.print(5);
	}
	
}



class ThreadTwo extends Thread
{
	
	Table t;
	
	ThreadTwo(Table t)
	{
		this.t=t;
	}
	
	public void run(){
		t.print(100);
	}
	
}



public class SyncDemo {

	public static void main(String[] args) {
		
		Table obj = new Table();
		
		ThreadOne t1= new ThreadOne(obj);
		ThreadTwo t2=new ThreadTwo(obj); 
		t1.start();
		t2.start();

	}

}
