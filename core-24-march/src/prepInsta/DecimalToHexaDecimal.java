package prepInsta;

import java.util.Scanner;

public class DecimalToHexaDecimal 
{
 public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in);
    System.out.println("please enter decimal number");
    int decimal=sc.nextInt();
    
    char a;
    String st="";
    String digit="0123456789ABCDEF";
    while(decimal>0)
    {
      int r=decimal%16;
      a=digit.charAt(r);
       st=a+st;
      decimal/=16;
      
    }
    System.out.println(st);
    
 }
}
