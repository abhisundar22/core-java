package superkeyword;



class Animal{
	
	
	Animal()
	{
		System.out.println("I am a parent cons- Animal");
	}
	

	String color="whitete";
	
	
	void eat(){
		System.out.println("Eating");
	}
	
}


class Dog extends Animal
{
	
	Dog()
	{
		//super();
		System.out.println("I am a child cons- Dog");	
	}
	
	String color="black";
	
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);//super keyword is used to access immediate parent instance and method
		super.eat();
	}
	
	
}





public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d=new Dog();
		d.display();

	}

}
