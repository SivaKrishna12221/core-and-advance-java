package java8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClasss {

	public static void main(String[] args) throws Exception{
		Date date1=new Date();
		System.out.println(date1);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MMMM/yyyy");
		String df1=sdf1.format(date1);
		System.out.println(df1);
		SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM/yyyy");
		Date d=sdf2.parse("23/12/2020");
		System.out.println(d);
		
	}
}
