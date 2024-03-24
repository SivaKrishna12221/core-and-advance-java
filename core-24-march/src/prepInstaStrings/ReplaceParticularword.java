package prepInstaStrings;

import java.util.Scanner;

public class ReplaceParticularword
{
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter one line sentence");
    String str=sc.nextLine();
    System.out.println("enter which word do you want to remove");
    String word=sc.nextLine();
    System.out.println("which word do you want to fix");
    String fix=sc.nextLine();
    String s1=str.replace(word,fix);
    System.out.println(s1);
}
}