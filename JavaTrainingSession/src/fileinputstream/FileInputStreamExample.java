package fileinputstream;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			FileInputStream fin= new FileInputStream("C:\\Users\\Sunda\\testout.txt");
			int i=0;
			
			while((i=fin.read())!=-1){
			System.out.print((char)i);
			}
			
			
		}catch(Exception e)
		{
			
		}
		

	}

}
