package datepack;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d= new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		String strDate=formatter.format(d);
		
		System.out.println(strDate);
		

	}

}
