package javatPointString;

public class ClassToCharArray
{
  public static void main(String[] args) {
	

  String s1="The java string toCharArray returns the string into character array .it return newly charcater array ,it length is simialar to the length of this string and its length of the string and its "
  		+ "contents are initialized with the characters of this string";
	/*
	 * char []s2=s1.toCharArray(); for (char s3:s2) { System.out.print(s3); }
	 */
 String s4=s1.toUpperCase();
 System.out.println(s4);
 
 String s5=" the java string tolowercase methods returns the string in lower case character  ";
 String s6=s1.toLowerCase();
 System.out.println(s6);
 s6=s6.trim();
 System.out.println(s6);
}
}