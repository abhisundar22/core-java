package outputstreamfile;

import java.io.FileOutputStream;

public class FileOutStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			FileOutputStream fout=new  FileOutputStream("C:\\Users\\Sunda\\testout.txt");
			
//			fout.write(65);
//			fout.close();
			
			
			String s="Welcome to Core Java Learning";
			
			byte b[]=s.getBytes();
			
			fout.write(b);
			
			fout.close();
			
			
			System.out.println("Success");
		}catch(Exception e)
		{
			
		}

	}

}
