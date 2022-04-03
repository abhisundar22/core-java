package methodoverriding;

class Vehicle
{
	void run()
	{
		System.out.println("Vehicle Running");
	}
}

class Bike extends Vehicle
{
	
	void run()
	{
		System.out.println("Bike Running");
	}
}



public class TestOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Bike b =new Bike();
		b.run();// It will execute only child method when htere duplicate
		
	}

}
