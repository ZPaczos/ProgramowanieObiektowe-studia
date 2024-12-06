import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Daty {
	
	LocalDate localDate;
	
	public static void getNextDay(LocalDate localDate){
		System.out.println("a) 2021-01-01 -> "+localDate.plusDays(1));
	}
	
	public static void getTomorrow() {
		LocalDate localDate1 = LocalDate.now();
		System.out.println("b) "+localDate1.plusDays(1));
	}
	
	public static void getPreviousDay(LocalDate localDate){
		System.out.println("c) 2021-01-01 <- "+localDate.minusDays(1));
	}
	
	public static void getYesterday()  {
		LocalDate localDate1 = LocalDate.now();
		System.out.println("d) "+localDate1.minusDays(1));
	}
	
	public static void getNextSunday(LocalDate localDate)  {
		int temp = localDate.getDayOfWeek().getValue();
		int week = 7, daysToAdd;
		if(localDate.getDayOfWeek().getValue() == 7) {
			System.out.println("e) "+localDate.plusDays(7));
		}else {
			daysToAdd = week - temp;
			System.out.println("e) "+localDate.plusDays(daysToAdd));
		}

	}
	
	
}
