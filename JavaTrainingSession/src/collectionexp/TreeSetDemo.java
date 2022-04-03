package collectionexp;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Sam");
		String s2= new String("Ram");
		String s3=new String("John");
		String s4=new String("John");
		
		TreeSet<String> hashSet = new TreeSet<>(); //retreive will be fast
		
		hashSet.add(s1);
		hashSet.add(s2);
		hashSet.add(s3);
		
		for(String s:hashSet)
		{
			System.out.println(s);
		}

	}

}
