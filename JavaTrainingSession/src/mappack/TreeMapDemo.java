package mappack;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap <Integer,String> map= new TreeMap<Integer,String>();//key value pair// key will not be dup
		
		
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3,"Banana");
		
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
