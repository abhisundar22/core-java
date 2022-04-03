package lambdapack;



interface Drawable
{
	public void draw(int a,int b);
	
	
}


public class LambdaRealDemo {

	public static void main(String[] args) {
		
		
		Drawable  d =(a,b)->{
			
				System.out.println("Drawing"+a+" "+b);
			
			
		};
		
		
		d.draw(100,200);

	}

}
