package java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class NewDateApi {

	public static void main(String[] args) {
	  LocalDate ld1=LocalDate.of(22, 10, 1);
	  System.out.println(ld1);
	  LocalDate ld2=LocalDate.now();
	  System.out.println(ld2);
	 ld2=ld2.plusDays(10);
	 System.out.println(ld2);
	 ld2=ld2.plusMonths(1);
	 System.out.println(ld2);
	LocalTime lt1= LocalTime.now();
	System.out.println("**************8");
	System.out.println(lt1);
	lt1=lt1.plusHours(10);
	System.out.println(lt1);
	 LocalDate ldt1 = LocalDate.parse("2000-10-21");
	 Boolean b=ldt1.isLeapYear();
	 System.out.println(ldt1);
	 System.out.println("leap year"+b);
	 System.out.println("**************Periods***********");
	 Period gap=Period.between(LocalDate.parse("2000-10-21"),LocalDate.now());
	 System.out.println(gap);
	 Period gap2=Period.between(LocalDate.parse("2002-04-12"),LocalDate.now());
	 System.out.println(gap2);
	 Period agegap= Period.between(LocalDate.parse("2002-04-12"),LocalDate.parse("2000-10-21"));
	 System.out.println(agegap);
	 System.out.println("*****************");
	 System.out.println("duration:");
	 Duration d=Duration.between(LocalTime.parse("11:10"),LocalTime.now());
	 System.out.println(d);
	}
}
