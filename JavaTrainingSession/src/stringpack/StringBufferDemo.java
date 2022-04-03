package stringpack;

public class StringBufferDemo {
	
	/*
	 * String Buffer is mutable , we can change 
	 * String Buffer is memory efficent
	 * String Buffer Thread safe.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("World");
		
System.out.println(sb);
		
	}

}
