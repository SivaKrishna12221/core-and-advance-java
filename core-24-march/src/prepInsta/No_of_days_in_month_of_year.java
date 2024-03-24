package prepInsta;

public class No_of_days_in_month_of_year 
/*
 * 1)first we need to declare an array and initialize days for every month in year
 * 2)write a code for leap year with respect feb month.that particular month add one day ..
 * 3)remaining month days will get exactly. 
 */
{
  public static void main(String[] args) 
  {
	  int month=2,year=2024;
	  int arr[]= {31,28,31,30,31,30,31,31,30,31,30,31};
	  if(month==2&&year%400==0||year%4==0&&year%100!=0)
	  {
		  System.out.println("The no.of days in given month is:"+(arr[month-1]+1));
	  }
	  else
	  {
		  System.out.println("The no.of days in given month is:"+arr[month-1]);
	  }
	  
  }
}
/*
 * package pack2;

public class Class 
{
 public static void main(String[] args) 
 {
	int month=2;
	int year=2023;
	if(month==2&&year%400==0||year%4==0&&year%100!=0)
	{
		System.out.println("29 days");
	}
	else if(month==2)
	{
		System.out.println("28 days");
	}
	else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
	{
		System.out.println("31 days");
	}
	else
	{
		System.out.println("30 days");
	}
		
		
}
}
*/
