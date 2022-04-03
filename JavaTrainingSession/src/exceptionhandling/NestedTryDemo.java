package exceptionhandling;

public class NestedTryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try
		{
			
			
			try{
				int a=100/0;
			}catch(ArithmeticException e)
			{
				System.out.println("arthimetic");
			}
			
           try{
				int a[] = new int[5];
				a[5]=10;
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("array exp");
			}
			
			
		}catch(Exception e)
		{
			
		}

	}

}
