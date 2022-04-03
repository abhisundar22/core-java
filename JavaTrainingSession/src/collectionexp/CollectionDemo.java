package collectionexp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*//List Set Map
		//List will have dup
		//Set will not have duplicate
	   //Map works in key value pair
		
		//List
		//ArrayList LinkedList Vector Stack
		
		Student s= new Student();
		Student s1= new Student();
		Student s2= new Student();
		
		
		{s,s1,s2} //i am collecting object  List /Set /Map
		*/
		
		
		String s1=new String("Sam");
		String s2= new String("Ram");
		String s3=new String("John");
		String s4=new String("Peter");
		
		ArrayList<String> list = new ArrayList<String>(); //Stream will used as part 1.8
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
		//Streams
		
		
	   List<String> samList =list.stream().filter(t->t.equals("Sam")).collect(Collectors.toList());
		
		
	   for(String s:samList)
		{
			System.out.println(s);
		}
		
		
		
	}

}
