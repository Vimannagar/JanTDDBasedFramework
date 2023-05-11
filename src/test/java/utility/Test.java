package utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Test {
	
	
	public static String getTime()
	{
DateTimeFormatter dff = DateTimeFormatter.ofPattern("yyyy MM dd HH mm ss msec");
		
		LocalDateTime now = LocalDateTime.now();
	
		String timevalue = dff.format(now);
		
		System.out.println(timevalue);
		
		String time = timevalue.replace(' ', '_');
		
		System.out.println(time);
		
		return time;
	}
	
	
	public static void main(String[] args) {
	DateTimeFormatter dff = DateTimeFormatter.ofPattern("yyyy MM dd HH mm ss msec");
		
		LocalDateTime now = LocalDateTime.now();
	
		String timevalue = dff.format(now);
		
		System.out.println(timevalue);
		
		String time = timevalue.replace(' ', '_');
		
		System.out.println(time);
		
	}

}
