package innerclass;

public class LocalInnerTest {

	private int data=30;
	
	
	void dispaly()
	{
		
		class Local
		{
			void msg()
			{
				System.out.println(data);
			}
			
		
		}
		
		Local l = new Local();
		l.msg();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerTest local=new LocalInnerTest();
		local.dispaly();

	}

}
