package constructor;


class Student
{
	int studentId;//instance variable
	String studentName;
	
//	
//	Student()//constructor it should same name as class name
//	{
//		System.out.print("I am constructor");
//		
//	}
	
	Student(int studentId,String studentName )
	{
		System.out.println("I am param constructor");
		this.studentId=studentId;///this keyword will refer to current invoking object
		this.studentName=studentName;
		
	}
	
	
}



public class StudentDemo {

	public static void main(String[] args) {
		
		
		Student s=new Student(123,"sam");
		
		System.out.println(s.studentId);

		System.out.println(s.studentName);
		// TODO Auto-generated method stub

	}

}
