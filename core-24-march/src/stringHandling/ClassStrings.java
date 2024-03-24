package stringHandling;

import java.util.Scanner;

public class ClassStrings 
/*
 * String handling :Strings accepts a group of characters
 * we need to store inside the string data inside;
 * =>we can create strings in java by using three classes they are String ,String buffer and String builder
 * Strings which we are created by using string classes are immutable;
 * Immutability means once we create an object for string class we cant
 * change the object if we are trying to change entirely new object 
 * created that means old object will not be affected.
 * 
 */
{
  void meth1()
  {
	  
	  String s1="java";//here we are creating an object for string class
	  s1.concat("is awesome");//we can't change the object of String class
	  String s2=new String("is awesome");//creating a java string by new keyword
	  System.out.println(s1);//before concatination 
	  System.out.println(s1.concat("is awesome"));//we can add String to Sting class object by using concatination with object refferenc
	  System.out.println(s1+s2);
	  char arr[]= {'s','i','v','a'};
	  
      String s3=new String(arr);//Coverting the char array into strings
      String s4=new String(arr,2,2);//arr stored in new String Class object with specific data characters
	  System.out.println(arr);
	  System.out.println(s4);
	  System.out.println("s1 length is:"+s1.length());
	  
	  String st1="java";
	  String st2="java";//same address location
	  String st3="awesome";
	  String st4="friends";//those four String class object refferences
	  //The st1,st2,st3,st4 are scp memory with sa address location inside memory
	  String st5=new String("java");
	  String st6=new String("is");
	  String st7=new String(" awesome");
	  //those obove objects are present inside the heap memory;
	  
	  
  }
  void meth2()
  {
	  String s1="java";
	  String s2=new String("java");
	  String s3="java";
	  String s4=new String("javA");
	  System.out.println(s1.equals(s2));//true;
	  //equals method check the content  present 
	  System.out.println(s1.equals(s4));//false
	  System.out.println(s1==s2);//false
	  //== checks the address location
	  System.out.println(s1==s3);//true because content same and it present inside the scp it is true;
	  System.out.println("java".equals(s1));//true
	  
	  
  }
  void meth3()
  {
	  String s1="siva krishna";
	  String s2=new String ("sithaRam");
	  String s3=new String("Sitha MahaLaskhmi");
	  String s4="NOorjahan";
	  System.out.println("charAt:"+s1.charAt(5));//fifth index position character
	  System.out.println(s1.startsWith("k"));//false boolea type
	  System.out.println("replace:"+s1.replace('k','K'));//siva Krishna
	  System.out.println("substring:"+s1.substring(5));//krishna
	  System.out.println("substring:"+s1.substring(5,10));//krish
	  System.out.println("trim:"+s1.trim());//siva Krishna
	  System.out.println("trim:"+s1.trim().length());//12
	  System.out.println("indexOf:"+s1.indexOf('k'));//by using characters we will find the index positions 
	  System.out.println("toLowerCase:"+s1.toLowerCase());//siva krishna
	  System.out.println("toUpperCase:"+s1.toUpperCase());
	  String st=new String("siva k\trishna");
	  System.out.println(st);
  }
  public static void main(String[] args) 
  {
	ClassStrings aobj=new ClassStrings();
	//aobj.meth1();
	//aobj.meth2();
	aobj.meth3();
	
}
}
