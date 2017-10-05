import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class DateExample {

	public static void main(String[] args) {
		
		String s="2017/10/22";
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate dd=LocalDate.parse(s,df);
		System.out.println(dd);
		
		/*LocalDate d=LocalDate.now(); 
		System.out.println(d);
		LocalDate d1=LocalDate.of(2016,03,21);
		LocalDate d1=LocalDate.of(2016,Month.SEPTEMBER,21);
		System.out.println(d1);
		System.out.println(d.getYear());
		System.out.println(d.getMonth());
		System.out.println(d.getDayOfMonth());
		System.out.println(d.plusDays(2));
		System.out.println(d.getDayOfWeek());*/
		
	}
}
