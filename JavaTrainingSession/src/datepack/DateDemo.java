package datepack;

import java.util.Date;
import java.util.TimeZone;

public class DateDemo {
	
	public static void main(String args[])
	{
		Date d= new Date();
		System.out.println(d);
		
		TimeZone zone =TimeZone.getDefault();
		System.out.println(zone);
		
		
	}

}
