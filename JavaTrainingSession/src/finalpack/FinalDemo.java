package finalpack;

class Bike
{
	final int speed=100;
	
	void run()
	{
		//speed=200; // I cannot change the value of final
		System.out.print(speed);
	}
}



public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b =new Bike();
		b.run();
		
	}

}
