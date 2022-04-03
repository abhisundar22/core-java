package inheritance;



class Animal//Parent
{
	
	void eat()
	{
		System.out.println("I am eating");
	}
}


class Dog extends Animal // Dog is a Animal
{
	void bark()
	{
		System.out.println("barking");
	}
}


public class TestInheritance {

	public static void main(String[] args) {
		
//		Animal a=new Animal();
//		a.eat();
		
		Dog  d = new Dog();
		d.bark();
		d.eat();
		

	}

}
