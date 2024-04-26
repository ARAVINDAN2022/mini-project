package miniproject;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFinder {
	public static String Date(){


	    Calendar calendar = Calendar.getInstance();
	    calendar.add(Calendar.DATE, 1); // add one day to the current date
        SimpleDateFormat dayFormat = new SimpleDateFormat("d");//formats the date as the day of the month (1-31).
	    //This line of code formats the calendar object’s time as a day of the month and assigns it to the String variable a.
        String a = dayFormat.format(calendar.getTime());
	    return a;
	    
		}
}
