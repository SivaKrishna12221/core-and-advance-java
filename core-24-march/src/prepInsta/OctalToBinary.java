package prepInsta;

import java.util.Scanner;

public class OctalToBinary 
{
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter octal value:");
    int octal=sc.nextInt();
    int binary[]=new int[20];
    int i=0;
    while(octal>0)
    {
    	int r=octal%2;
        binary[i++]=r;
        octal/=2;
    }
    for(int j=i-1;j>=0;j--)
    {
      System.out.print(binary[j]+"");
    }
    System.out.println();
}
}
