package exceptionhandling;

public class JavaExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data=0;
		try{
		 data=100/0; //stmt1
		
		}
		catch(ArithmeticException e)
		{
			System.out.print("You done mistake in arithmetic operation please check"+e); //stmt2	
		}
		System.out.println(data); //stmt2
		System.out.println(data); //stmt2
		System.out.println(data); //stmt2
		System.out.println(data); //stmt2
		System.out.println(data); //stmt2
		System.out.println(data); //stmt2
		System.out.println(data); //stmt2
		System.out.println(data); //stmt2
		System.out.println(data); //stmt2

	}

}
