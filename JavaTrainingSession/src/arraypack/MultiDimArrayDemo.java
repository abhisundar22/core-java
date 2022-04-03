package arraypack;

public class MultiDimArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*0,0 --1
		0,1--2
		0,2--3
		
		1,0-6*/
		int a[][] ={{1,2,3},{6,7,8},{9,10,11}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
