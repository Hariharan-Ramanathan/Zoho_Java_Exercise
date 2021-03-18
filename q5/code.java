// 5.Write a program to print todays date in the format Day MMM DD hr.min.sec TIMEZONE YYYY [Ex: Fri Aug 01 16:16:27 IST 2008] using date format .
//    Use SimpleDateFormat class to format the date to specified format.


package q5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class code {

	public static void main(String[] args) throws Exception {
		Date date = new Date();

		SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
		
		String now = formatter.format(date);
		
		System.out.println(now);
	}

}
