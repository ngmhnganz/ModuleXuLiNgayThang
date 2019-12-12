package nguyenminhngan.com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class time {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		System.out.println(date); 
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf.format(date));
	}

}
