package stringpack;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. By String literal
		
		
		//By new Keyword
		
		
		String s="Hello";
		String s1="Hello";
		
		String str= new String("Hello");
	
		
		System.out.println(s);
		
		System.out.println(str);
		
		
		int len=s.length();
		System.out.println(len);
		
		if(s.equals(s1))
		{
			System.out.println("Both are equal");
		}
		
		if(s.equalsIgnoreCase(s1))
		{
			System.out.println("Both are equal");
		}
		
		
		//String immutable ,we cannot change once created;
		
		String strg="Hello"; // new memory created in heap  Hello 
		strg= strg+ "World";// again new memory will created in heap Hello World
		System.out.println(strg);
		
		
		
		
		

	}

}
