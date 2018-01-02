import java.time.LocalDate;

public class Lab3 {

	public static void main(String[] args) {
		LocalDate date=LocalDate.of(2012, 9, 26);
		System.out.println(date);
		System.out.println("YEAR:"+date.getYear());	
		System.out.println("MONTH:"+date.getMonth());
		System.out.println("MONTH VALUE:"+date.getMonthValue());	
		System.out.println("DATE:"+date.getDayOfMonth());
		System.out.println("Day of week:"+date.getDayOfWeek());
		System.out.println("Day of week value:"+date.getDayOfWeek().getValue());
		System.out.println("Year Length:"+date.lengthOfYear());
		
		LocalDate date1=LocalDate.now();
		System.out.println("\nYear:"+date1.getYear());
		System.out.println("MONTH:"+date1.getMonth());
		System.out.println("MONTH VALUE:"+date1.getMonthValue());
		
	}

}
