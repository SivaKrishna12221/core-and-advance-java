package prepInstaStrings;

public class RemoveVowels 
//it is possible by using replaceall method charecter position replace with space 
{
   public static void main(String[] args)
   {
	String s1="siva krishna";
	String s2="";
	s2=s1.replaceAll("[aeiou]","");
	System.out.println("String after removing vowel:"+s2);
}
}
//String after removing vowel:sv krshn
