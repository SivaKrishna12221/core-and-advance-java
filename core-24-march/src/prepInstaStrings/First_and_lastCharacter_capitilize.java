package prepInstaStrings;

import java.util.Scanner;

public class First_and_lastCharacter_capitilize 
{
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter some string data:");
	String s1=sc.nextLine();
	String newStr="";
    String words[]=s1.split("\\s");
    
    
    for(String str:words)
    {
    	int length=str.length();
    	String firstchar=str.substring(0,1);
    	String restchar=str.substring(1,length-1);
    	String lastchar=Character.toString(str.charAt(length-1));
    	 newStr=newStr+firstchar.toUpperCase()+restchar+lastchar.toUpperCase()+" ";
    	
    }
    System.out.println(newStr);
}
}
