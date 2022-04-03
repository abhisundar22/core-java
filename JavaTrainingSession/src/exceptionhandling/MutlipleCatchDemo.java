package exceptionhandling;

public class MutlipleCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a[]= new int[5];
			a[5]=30/0;
			
		}catch(ArithmeticException e)
		{
			System.out.println("Arth Exp");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Exp");
		}catch(Exception e)
		{
			System.out.println("Parent");
		}
		
		System.out.println("Rest of the code");
		
		
		
		
		
		

	}

}
