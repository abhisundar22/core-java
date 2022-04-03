package methodassign;




 class Student
{
	int studentId;//instance variable
	String studentName;
	
	void assign(int i,String s)//method
		{
		studentId=i;
		studentName=s;
		
	}
	
	
	
}



public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		s.assign(123, "sam");
		
		System.out.println(s.studentId);

		System.out.println(s.studentName);
		
	}

}
