package prepInstaStrings;

import java.util.Scanner;

public class RemoveParticularWord 
{
  public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter some data:");
	String data=sc.nextLine();
	System.out.println("which word do you want to remove:");
	String word=sc.nextLine();
	String remove=data.replace(word,"");
	System.out.println(remove);
  }
  
}
