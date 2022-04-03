package packwithoutlambda;


interface Drawable
{
	public void draw();
}


public class LambdaDemo {

	public static void main(String[] args) {

		
		Drawable  d =new Drawable(){
			public void draw()
			{
				System.out.println("Drawing");
			}
			
		};
		
		
		d.draw();
		
	}

}
