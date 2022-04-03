package objectcloning;



class Student implements  Cloneable
{
	int id;
	String studentName;
	
	
	Student(int id,String studentName)
	{
		this.id=id;
		this.studentName=studentName;
	}
	
	
	void display()
	{
		System.out.println(id + " "+studentName);
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	
}


public class StudentCloneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Student s=new Student(123,"sam");
		s.display();
		
		/*Student s1=new Student(124,"ram");
		s1.display();
		*/
		
		Student s1=(Student) s.clone(); // cloning and type casting from Object to Student
		s1.display();
		
			
		
		}catch(Exception e)
		{
			
		}
		

	}

}
