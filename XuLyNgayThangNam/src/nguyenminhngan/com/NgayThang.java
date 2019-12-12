package nguyenminhngan.com;

import java.util.Calendar;

public class NgayThang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nguyễn Minh Ngân");
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	}

}
