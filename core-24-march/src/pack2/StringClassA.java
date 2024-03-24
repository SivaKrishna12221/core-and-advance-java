package pack2;
/*
 * String handling:Strings accepts a group of Characters ..
 * we need to store String data inside..
 * there are three types strings
 * 1)Strings 2) String Buffer 3)String Builder
 * 1)Strings which are created by String class are IMMUTABLE
 * Immutability means once we have created a String Class object we can't change
 * if we want to change the object entirely a new String object will be created.
 * and old object will affected with changes..
 * 
 */

public class StringClassA 
{
  void meth1()
  {
	  String s1="java";
	  String s2=new String ("java");
	  char arr[]= {'j','a','v','a' };
	  String s3=new String(arr);
	  String s4=new String(arr,0,4);//first is index and second is char length for showing
	  
	  System.out.println("s1 "+s1);
	  System.out.println("s2 "+s2);
	  System.out.println("s3 "+s3);
	  System.out.println("s4 "+s4);
	  System.out.println("===============");
	  System.out.println("s1 length is "+s1.length());
	  System.out.println("Java is awesome".length());
	  //Strings which are created by using string class are immutable.
			  
	 
	  
  }
  void meth2()
  {
	  String s="java";
	  System.out.println("Before concatination s value:"+s);
	  System.out.println(s.concat(" is awesome"));
	  System.out.println("After concatination s value:"+s);
	  
  }
  public static void main(String[] args) 
  {
	  StringClassA aobj=new StringClassA();
	 // aobj.meth1();
	  aobj.meth2();
	
}
	

}
