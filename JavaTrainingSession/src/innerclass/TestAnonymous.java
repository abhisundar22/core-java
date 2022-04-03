package innerclass;

interface Eatable
{
	void eat();
}


public class TestAnonymous {

	public static void main(String[] args) {
		
		
		Eatable e=new Eatable(){
			
			public void eat()
			{
				System.out.print("Nice fruits");
			}
		};
		
		
		e.eat();
		

	}

}
