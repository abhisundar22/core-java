package innerclass;

public class TestOuter {
	
	static int data=30;
	
	static class Inner
	{
		void msg()
		{
			System.out.println("data"+data);
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOuter.Inner obj = new TestOuter.Inner(); //synatx to create an object
		obj.msg();
		
		
	}

}
