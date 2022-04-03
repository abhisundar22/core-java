package innerclass;

public class TestMember {
	
	private int data=100;
	
	
	
	class Inner
	{
		void msg(){
			System.out.println("Hello I am innser class methd"+data);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestMember testObj=new TestMember();
		
		TestMember.Inner innerObj= testObj.new Inner(); //syntax to create an obj for inner class
		
		
		innerObj.msg();
	}

}
