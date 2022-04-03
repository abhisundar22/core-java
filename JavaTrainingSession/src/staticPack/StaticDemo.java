package staticPack;


class Student
{
	
	
	
	int studentId;//instance variable
	String studentName;
	static String college="IIT";
	
	
	void assign(int i,String s)//method
	{
	studentId=i;
	studentName=s;
	}
	static//static block it always executed first before constructor
	{
		System.out.println("I am static");
	}
	
	static void display()
	{
		System.out.println("I am static method");
	}
	


	
	
}



public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.assign(123, "sam");
		Student.display();
		
		System.out.println(s.studentId);

		System.out.println(s.studentName);
		
		System.out.println(Student.college);

	}

}
