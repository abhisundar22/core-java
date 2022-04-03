package multilevel;




class Animal//Parent
{
	int a=100;
	
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

class BabyDog extends Dog
{
	void babyMethod()
	{
		System.out.println("baby dog");
	}
}





public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog b=new BabyDog();
		b.babyMethod();
		b.bark();
		b.eat();
		
	
		
		

	}

}
