package arraypack;

public class DemoArray {
	
	
	static void printArray(int arr[])
	{
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5]; 
		
		 a[0]=100;
		 a[1]=200;
		 a[2]=300;
		 a[3]=400;
		 a[4]=500;
		
		 
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
		
		 int b[]={10,20,30,40};
		 for(int j=0;j<b.length;j++)
		 {
			 System.out.println(b[j]);
		 }
		
		 
		 printArray(new int[]{1000,2000,30000});
		 
		 
		 
	}

}
