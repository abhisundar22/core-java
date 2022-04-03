package datepack;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date= LocalDate.now();
		
		LocalDate yesterday= date.minusDays(1);
		
		LocalDate tommorow = date.plusDays(4);
		
		System.out.println(date);
		
		System.out.println(yesterday);
		
		System.out.println(tommorow);
		
		

	}

}
