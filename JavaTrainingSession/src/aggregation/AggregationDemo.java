package aggregation;




class Student
{
	Address addr; // Student has a Address
	
	
	void display()
	{
		addr= new Address();
		System.out.print("I am a student");
		addr.displayAddress();
	}
}


class Address{
	
	void displayAddress()
	{
		System.out.print("Bangalore India");
	}
	
}


public class AggregationDemo {

	public static void main(String[] args) {
		
		
		Student s =new Student();
		s.display();
		
		
		

	}

}
