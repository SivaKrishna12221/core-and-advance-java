package prepInstaStrings;

import java.util.Arrays;

public class CountVowels 
{
 public static void main(String[] args) {
	

 String s="siva krishna";
 ///char []c=s.toCharArray();
 //System.out.println(Arrays.toString(c));
 int vowel=0;
 
 for(int i=0;i<s.length();i++)
 {
	if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')

{
	vowel++;
}
 } 
 System.out.println("vowels"+vowel);
}
}