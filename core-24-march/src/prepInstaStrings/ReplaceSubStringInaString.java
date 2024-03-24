package prepInstaStrings;

import java.util.Scanner;

public class ReplaceSubStringInaString 
{
 public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string:");
	String s1=sc.nextLine();//prepinsta
	System.out.println("enter replace string:");
	String oldString=sc.nextLine();//insta
	System.out.println("enter new String:");
	String newString=sc.nextLine();// is good
	String replaceString=s1.replace(oldString, newString);
	System.out.println("new String is:"+replaceString);
	
}
}
/*
 * enter a string:
I am student;
enter replace string:
student
enter new String:
stupid
new String is:I am stupid;
*/
