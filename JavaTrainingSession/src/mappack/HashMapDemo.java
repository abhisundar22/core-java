package mappack;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap <Integer,String> mapp= new HashMap<Integer,String>();//key value pair// key will not be dup
		
		
		mapp.put(1, "Mango");
		mapp.put(2, "Apple");
		mapp.put(3,"Banana");
		
		
		for(Map.Entry m : mapp.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		String result =mapp.entrySet().stream().filter(map->"Apple".equals(map.getValue())).map(map->map.getValue())
				.collect(Collectors.joining());
		System.out.println(result);
		
		
		Map<Integer,String> tmpMap=mapp.entrySet().stream().filter(map->"Apple".equals(map.getValue()))
				.collect(Collectors.toMap(p->p.getKey(),p->p.getValue()));
		
		for(Map.Entry m : tmpMap.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
