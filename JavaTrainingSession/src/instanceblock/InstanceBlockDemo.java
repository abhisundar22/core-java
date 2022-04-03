package instanceblock;


/*
 * class will have
 * instance variable
 * static variable
 * constructor
 * method
 * static block
 * instance block
 */

class Bike
{
	int speed;
	
	Bike()
	{
		System.out.println(speed);
	}
	
	{
		System.out.println("hi");
		speed=100;
	}//instance block
	
}

public class InstanceBlockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b1=new Bike();
		
		

	}

}
