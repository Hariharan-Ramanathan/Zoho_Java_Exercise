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
