package exceptionhandling;




public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a=100/100;
		}catch(ArithmeticException e)
		{
			System.out.println("artithmetic Ex");
		}
		finally
		{
			System.out.println("I am always exectured");
		}

	}

}
