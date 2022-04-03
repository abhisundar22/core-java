package accessmodifiers;


//private protected public default
//Private

class A
{
	private int data=40;
	
	private void msg()
	{
		System.out.println("Hello");
	}
	
}

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a =new A();
		//a.data=10;
		//a.msg();

	}

}
