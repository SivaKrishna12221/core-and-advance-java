package prepInstaStrings;

public class ReverseString 
{
 public static void main(String[] args) {
	
 String s="siva krishna";
 String rev="";
 for(int i=s.length()-1;i>=0;i--)
 {
	rev=rev+s.charAt(i) ;
 }
 System.out.println(rev);
 /*
  * By using String builder 
  */
 String st="siva krishna";
 StringBuilder sb=new StringBuilder();
 //here we are creating String builder class object for Storing string data
 sb.append(st);
 System.out.println(sb);
 //for reversing string builder we have a method.reverse();
 sb.reverse(); 
 System.out.println(sb);
}
 
 
 
}