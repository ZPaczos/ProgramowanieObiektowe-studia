import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(100);
		
		for(int i=0; i<16; i++) {
			sb = sb.append("na");
		}
		sb.append("Batman!!!");
		System.out.println("Æwiczenie 1.3: "+sb);
		System.out.println("Æwiczenie 1.4: "+sb.indexOf("Batman!!!"));
		
		sb.insert(sb.indexOf("Batman!!!"), "...");
		System.out.println("Æwiczenie 1.5: "+sb);
		
		System.out.println("Æwiczenie 2.1: "); 
		LocalDateTime now = LocalDateTime.now();
		System.out.println("a) "+now.getDayOfMonth()+"-"+now.getMonthValue()+"-"+now.getYear());
		System.out.println("b) "+now.getHour()+":"+now.getMinute()+":"+now.getSecond());
		
		LocalDate localDate = LocalDate.now();
		LocalDate earlier = localDate.minusDays(100);
		System.out.println("c) "+earlier.getDayOfWeek());
		
		LocalDate localDate2 = LocalDate.of(2021, 1, 1);
		System.out.println("d) "+localDate2.getDayOfWeek());
		LocalDateTime nextTime = now.plusHours(2).plusMinutes(55);
		System.out.println("e) "+nextTime.getHour()+":"+nextTime.getMinute()+":"+nextTime.getSecond());
	
		LocalDateTime past = now.minusDays(3000);
		Year year = Year.of(past.getYear());
		
		if(year.isLeap()) {
			System.out.println("f) Rok "+past.getYear()+" jest przestêpny");
		}else {
			System.out.println("f) Rok "+past.getYear()+" nie jest przestêpny");
		}
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(now.getYear(), now.getMonthValue(), now.getDayOfMonth());
		System.out.println("g) Liczba dni w bie¿¹cym miesi¹cu: "+calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		LocalDate localDate1 = LocalDate.parse("1998-01-22");
		System.out.println("h) Liczba dni od daty urodzenia: "+ChronoUnit.DAYS.between(localDate1, localDate));
        
		System.out.println("Æwiczenie 2.2 i 2.3: ");
		//System.out.println(localDate.getDayOfWeek());
		Daty z = new Daty();
		z.getNextDay(localDate2); //wpisana data: 1.1.2021
		z.getTomorrow();
		z.getPreviousDay(localDate2); //wpisana data: 1.1.2021
		z.getYesterday();
		z.getNextSunday(localDate2); //wpisana data: 1.1.2021
		
	}	
		

}
