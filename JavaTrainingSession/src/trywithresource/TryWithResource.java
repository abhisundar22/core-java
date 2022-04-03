package trywithresource;

import java.io.FileOutputStream;

public class TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try(FileOutputStream fout=new  FileOutputStream("F:\\Users\\Sunda\\trytestout.txt");)
		{
		
       
			
//			fout.write(65);
//			fout.close();
			
			
			String s="Welcome to Core Java Learning";
			
			byte b[]=s.getBytes();
			
			fout.write(b);
			
			fout.close();
			
			
			System.out.println("Success");
			
		}catch(Exception e)
		{
			System.out.println("not success");
		}
		
	}

}
