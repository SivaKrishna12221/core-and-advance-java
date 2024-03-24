package pack2;
/*
 * Given a string ,return a new string made of 3 copies of the last 2 chars of the 
 * original string.The string length will be at least 2.
 * extraEnd("hello")?"lololo"
 */

public class StringClassE 
{
 public String extraEnd(String str)
 {
	 String s=str.substring(str.length()-2);
	 return s+s+s;
 }
 public static void main(String[] args) 
 {
	 StringClassE eobj=new StringClassE();
	 String str=eobj.extraEnd("chandu");
	 System.out.println(str);
	
}
}
