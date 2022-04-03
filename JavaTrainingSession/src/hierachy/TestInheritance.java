package hierachy;





class Animal//Parent
{
	
	void eat()
	{
		System.out.println("I am eating");
	}
}


class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking");
	}
}

class Cat extends Animal
{
	void meow()
	{

		System.out.println("meow");
	}
}





public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		d.eat();
		d.bark();
		
		
		Cat c =new Cat();
		c.eat();
		c.meow();
	}

}
