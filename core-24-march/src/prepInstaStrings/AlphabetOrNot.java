package prepInstaStrings;

public class AlphabetOrNot 
{
 public static void main(String[] args) {
	

 char ch;
 ch='9';
 if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
 {
	 System.out.println(ch+"is a alphabet");
 }
 else
 {
	 System.out.println(ch+"is not alphabet");
 }
}
}