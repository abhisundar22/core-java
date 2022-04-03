package exceptionhandling;


class InValidAgeException extends Exception 
{
	
	public InValidAgeException(String str)
	{
		super(str);
	}
}




public class TestCustomException {

	
	static void validate(int age)throws InValidAgeException
	{
		
		if(age<18)
		{
			throw new InValidAgeException("age is not valid to vote");
		}
		else{
			System.out.println("Welcome to vote");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			validate(19);
		} catch (InValidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println("caught exp");
		}
		

	}

}
