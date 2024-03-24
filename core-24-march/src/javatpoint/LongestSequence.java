package javatpoint;

import java.util.Arrays;

public class LongestSequence {

	public static void main(String[] args) {
     String st1="AbDFAAbdfh";
     int len=st1.length();
     int size=len*(len+1)/2;
     String str[]=new String[size];
     int incre=0;
     for(int i=0;i<len;i++)
     {
    	 for(int j=i;j<len;j++)
    	 {
    		 str[incre]=st1.substring(i,j+1);
    		 incre++;
    	 }
    	 
     }
     for(String s:str)
     {
    	 System.out.print(s+",");
     }
     System.out.println();
     int count=0;
     int maxcount=0;
     String longcharseq=null;
     for(int k=0;k<len;k++)
     {
       for(int l=k;l<len;l++) 
       {
    	  if(str[k].equals(str[l+1]));
    	  {
    		 count=str[k].length();
    		 longcharseq=str[k];
    	  }
    	  if(count>maxcount)
    	  {
    		 maxcount=count;
    		 longcharseq= str[k];
    	  }
    	  
       }
     }
     System.out.println(longcharseq);
	}
}
