package prepInsta;

import java.util.Scanner;

public class Convert0to1 
{
 public static void main(String[] args) 
 {
	Scanner sc =new Scanner(System.in);
	System.out.println("please enter numbers");
    int num=sc.nextInt();
	String str=Integer.toString(num);//here conversion occur number to String
	int len=str.length();
	String str1="";
    for(int i=0;i<len;i++)
    {
    	if(str.charAt(i)=='0')
    	
    		str1=str1+'1';
    	
    	else
    	
    		str1=str1+str.charAt(i);
    	
    }
    System.out.println("after conversion:"+str1);
    sc. close();
}
 
}
