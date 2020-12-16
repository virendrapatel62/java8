package java8;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DateTimeApi {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		System.out.println(date.plusDays(50));
		
		System.out.println(
				date.format(DateTimeFormatter.ofPattern("d:MMM:uuuu"))
				);
		
		System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));
	}
}
