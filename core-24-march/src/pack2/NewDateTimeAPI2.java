package pack2;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Set;

public class NewDateTimeAPI2
{
	void meth1()
	{
	 Set<String> id=ZoneId.getAvailableZoneIds();
	 System.out.println("===>"+id.size());
	 for(String s:ZoneId.getAvailableZoneIds())//here we are retrieving the ids by using for-each
		 System.out.println(s);
	}
 public static void main(String[] args) 
 {
	 System.out.println("Introducing new DateTimeAPI");
	 System.out.println(LocalTime.now());
	 System.out.println(LocalDate.now());
	 System.out.println(LocalDateTime.now());
	 System.out.println(ZonedDateTime.now());
	 System.out.println(LocalTime.now(ZoneId.of("Europe/Athens")));
	 new NewDateTimeAPI2().meth1();
	 
	
}
}
