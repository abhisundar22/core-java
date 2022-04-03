package exceptionhandling;

import java.io.IOException;

public class TestThrowsDemo {
	
	
	void m() throws IOException
	{
		System.out.println("I am m method");
		throw new IOException("Device Error");
	}
	
	
	void n() throws IOException
	{
		m();
	}

	 void p()
	 {
		 try {
			n();
		} catch (IOException e) {
			System.out.println("The exception is thrown by m is handled here by p method");
		}
	 }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestThrowsDemo obj= new TestThrowsDemo();
			
		obj.p();
		
		
		System.out.println(" I am noraml flow");
		

	}
	
	
	

}
