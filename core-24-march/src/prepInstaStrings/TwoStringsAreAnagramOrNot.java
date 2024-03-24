package prepInstaStrings;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStringsAreAnagramOrNot 
{
  static boolean isAnagaram(String s1,String s2)
  {
	  //in order to remove the spaces ..use replaceAll("[\\s]","")
	  String str1=s1.replaceAll("\\s","");
	  String str2=s2.replaceAll("\\s","");
	  boolean status=true;
	  if(str1.length()!=str2.length())
	  {
		  status =false;
	  }
	  else
	  {
		 char []a1=str1.toLowerCase().toCharArray();//strings convert into lower case and also array
		 char []a2=str2.toLowerCase().toCharArray();
		 //here we need to covert the data into sorting form
		 Arrays.sort(a1);
		 Arrays.sort(a2);
		 status=Arrays.equals(a1, a2);
	  }
	  return status;
  }
  public static void main(String[] args)
  {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("please enter two Strings:");
	 String s1=sc.next();
	 String s2=sc.next();
	 boolean status=isAnagaram(s1,s2);
	 if(status)
	 {
		 System.out.println(s1+"and "+s2+"are anagram words");
	 }
	 else
	 {
		 System.out.println(s1+"and"+s2+" are not anagram words");
	 }
	
}
}
