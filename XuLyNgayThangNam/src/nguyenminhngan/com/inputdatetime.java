package nguyenminhngan.com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class inputdatetime {

	public static void main(String[] args) {
		System.out.println("Nhập ngày tháng ( dd/MM/yyyy");
		Scanner scan = new Scanner(System.in);
		String date = scan.next();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
			 Date DateInput = new Date();
			 sdf.format(DateInput);
			
			 Calendar cal = Calendar.getInstance();
			 int namnay = cal.get(Calendar.YEAR);
			 int namsinh = DateInput.getYear();
			 System.out.println();
			 System.out.println(DateInput);
		 
	}

}
