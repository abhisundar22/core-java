package finalmethodpack;


/*final class Bike // we cannot inherit this class
{
	final void run()
	{
		System.out.println("Bike is running");
	}
}*/

 class Bike
{
	final void run()
	{
		System.out.println("Bike is running");
	}
}



class Honda extends Bike  
{
	/*void run() // I cannot override the final method
	{
		System.out.println("Homda is running");
	}*/
}




public class FinalMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Honda h= new Honda();
		h.run();

	}

}
