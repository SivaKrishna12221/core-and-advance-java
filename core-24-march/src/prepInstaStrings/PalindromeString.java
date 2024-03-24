package prepInstaStrings;

public class PalindromeString 
{
	static boolean palindrome(String s)
	{
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
		}
		if(s2.equals(s))
		{
		return true;
		}
		else
			return false;
	}
 
 public static void main(String[] args) 
 {
	 String s="abcba";
	 
	if(palindrome(s))
	{
		System.out.println("given string is palindrome");
	}
	else
	{
		System.out.println("it is not a palindrome");
	}
}
}
