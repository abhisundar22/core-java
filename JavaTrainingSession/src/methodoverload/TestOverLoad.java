package methodoverload;




class Add
{
	void sum(int a,int b)
	{
		System.out.println(" The sum a,b "+ (a+b));
	}
	
	void sum(int a,int b,int c)
	{
		System.out.println(" The sum a,b,c "+ (a+b+c));
	}
	
	void sum(float a,float b)
	{
		System.out.println(" The sum a,b,c "+ (a+b));
	}
	
}

public class TestOverLoad {
	
	public static void main(String args[])
	{
		Add a= new Add();
		a.sum(10,10);
		a.sum(10.5f, 10.5f);
		a.sum(10, 10, 10);
	}

}
