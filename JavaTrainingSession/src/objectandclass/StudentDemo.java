package objectandclass;


class Student
{
	int studentId;//instance variable
	String studentName;
	
	
	
	
	
}

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();//to create an object for a class
		
		System.out.println(s);
		
		s.studentId=123;
		s.studentName="ram";

		System.out.println(s.studentId);

		System.out.println(s.studentName);
		
		
		

	}

}
