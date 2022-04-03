package collectionexp;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet
		//LinkedHashSet
		//TreeSet
		
		String s1=new String("Sam");
		String s2= new String("Ram");
		String s3=new String("John");
		String s4=new String("John");
		
		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add(s1);
		hashSet.add(s2);
		hashSet.add(s3);
		
		for(String s:hashSet)
		{
			System.out.println(s);
		}
		

	}

}
