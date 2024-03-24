package pack2;

import java.time.ZonedDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class NewDateTimeAPI 
{
  void meth1()
  {
	  System.out.println("introducing new dateTime API");
	  Set<String> ids=ZoneId.getAvailableZoneIds();
	  System.out.println("===>"+ids.size());
	  for (String s:ZoneId.getAvailableZoneIds())
		  System.out.println(s);
      
  }
  public static void main(String[] args) 
  {
	System.out.println(LocalDate.now());//2022-12-08
	System.out.println(LocalTime.now());//10:15:16.556468999
	System.out.println(LocalDateTime.now());//2022-12-08 to 10:17:13.602140
	System.out.println(ZonedDateTime.now());
	System.out.println(LocalTime.now(ZoneId.of("Australia/Lindeman")));
	System.out.println(LocalTime.now(ZoneId.of("Asia/Aden")));
	
	//new NewDateTimeAPI().meth1();
}
  
 
	
}
