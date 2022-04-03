package supercons;


class Person
{
	int id;
	String name;
	
	Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}

class Emp extends Person
{
	
	float salary;
	
	Emp(int id, String name, float salary)
	{
		super(id,name); // super keyword usage in cons
		this.salary =salary;
	}
	
	void display()
	{
		System.out.println(id+ " " + name + " " + salary);
	}
	
}

public class SuperConsDemo {

	public static void main(String[] args) {

		Emp e = new Emp(123,"Sam",100000.00f);
		e.display();
		
	}

}
