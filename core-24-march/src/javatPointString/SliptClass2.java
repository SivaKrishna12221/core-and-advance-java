package javatPointString;

import java.util.Scanner;

public class SliptClass2 
{
  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter String data:");
     String s1=sc.nextLine();
     String []str1=s1.split("\\s",0);
     for(String string:str1)
     {
    	 System.out.println(string);//here we will get the data in equal to no.of words
    	 
     }
     String []str2=s1.split("\\s",1);//here complete data show in one line
     for(String string2:str2)
     {
    	 System.out.println(string2);
     }
     String []str3=s1.split("\\s",3);//here first two words in two lines  reaming data in another line
     for(String string3:str3)
     {
    	 System.out.println(string3);
     }
     String str=s1.replaceAll("[\\s]","");//it remove spaces
     System.out.println(str);
}
}
