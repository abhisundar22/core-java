package controlstatement;

public class ControlDemo {
	
	
	
	public static void main(String args[])
	{
		
		int age=18;
		
		if(age>=18){
			System.out.println("You are eligible for voting");
			
		}else
		{
			System.out.println("You are not eligible for voting");
		}
		
		
		int mark=100;
		
		if(mark<=50)
		{
			System.out.println("C");	
		}else if(mark >50 && mark<=75)
		{
			System.out.println("B");
		}else
		{
			System.out.println("A");
		}
		
		
		int h=4;
		int w=60;
		
		
		if(w>=60 && w<=70)
		{
			if(h>=5 && h<=6)
			{
				System.out.println("FIT");
			}
		}
		
		
	}
	

}
