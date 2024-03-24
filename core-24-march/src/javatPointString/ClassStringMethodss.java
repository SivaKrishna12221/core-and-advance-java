package javatPointString;

public class ClassStringMethodss
{
 public static void main(String[] args) {
	String s1=new String("hello world");
	//java String CharAt() methods returns the char value at the given index number
	System.out.println("charAt:"+s1.charAt(8));
	System.out.println("campareTo"+s1.compareTo("hello world"));
	//java String class compareTo() method compares the given string with the current string lexicographically.It 
	//return positive ,negaticve number, or 0.
	//Ic compares the string on the basis of the unicode value of each character in the strings.
	String s2=new String("HELLO WORLD");
	System.out.println(s1.compareTo(s2));
}
} 
