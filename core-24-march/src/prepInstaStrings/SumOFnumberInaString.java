package prepInstaStrings;

public class SumOFnumberInaString 
{
  public static void main(String[] args)
  {
	String s="si33534kri453na";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
	  if(Character.isDigit(s.charAt(i)))
	  {
		  count=count+Character.getNumericValue(s.charAt(i));
	  }
	}
	System.out.println("sum of all the digit present in String :"+count);
}
}
