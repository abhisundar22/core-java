package interfacepack;


interface Printable
{
	void print(); // declartion
	
}

interface Drawable
{
	void draw();
}



class A implements Printable,Drawable
{

	public void print() { // Defintion
		
		System.out.println("Printable output");
	}

	public void draw() {
		System.out.println("Drawing done by A");
		
	}
	
	
}



public class InterfaceDemo {
	
	public static void main(String args[])
	{
		A a=new A();
		a.print();
		a.draw();
		
	}

}
