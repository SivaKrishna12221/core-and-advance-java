package prepInstaStrings;

public class StringLength
{
 public static void main(String[] args) 
 {
	String s="venkateswara";
	int len=0;
	for(char c:s.toCharArray())//here it converts the string into character Array
		len++;
	System.out.println("length of string is:"+len);
	
 }
}
