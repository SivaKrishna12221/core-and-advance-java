package prepInsta;

public class LeapYear
//the year divisible by 400 or the year divisible by 4 but not 100
{
  public static void main(String[] args)
  {
	int year=2024;
	boolean leap;
	if(year%400==0)
		leap=true;

	else if(year%4==0&&year%100!=0)
		leap=true;
	else
		leap=false;
	
	if (leap)
		System.out.println("The year is leap");
	else 
	System.out.println("the year is not leap");
	
	
		
}
}
