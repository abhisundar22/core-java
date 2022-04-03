package mappack;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hash table works in sync
Hashtable <Integer,String> map= new Hashtable<Integer,String>();//key value pair// key will not be dup
		
		
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3,"Banana");
		
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
