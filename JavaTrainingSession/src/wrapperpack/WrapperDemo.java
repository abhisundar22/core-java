package wrapperpack;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		
		
		Integer i = Integer.valueOf(a); //convertion from primitive to wrapper explicit conversion
		
		
		Integer j= a; //Autoboxing
		
		System.out.println(i);
		
		
		System.out.println(j);
		
		
	}

}
