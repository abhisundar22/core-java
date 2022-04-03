package collectionexp;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=new String("Sam");
		String s2= new String("Ram");
		String s3=new String("John");
		
		
		LinkedList<String> list = new LinkedList<String>(); //will be fast in insert and delete
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		
		for(String s:list)
		{
			System.out.println(s);
		}

	}

}
