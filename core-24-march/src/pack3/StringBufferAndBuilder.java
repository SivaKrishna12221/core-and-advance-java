package pack3;

public class StringBufferAndBuilder
{
  void meth1()
  {
	  String s=new String("java");
	  StringBuffer buffer1= new StringBuffer("java");
	  StringBuilder builder=new StringBuilder("java");
	  
	  s.concat("is awesome");
	  buffer1.append(" is awesome");
	  builder.append(" is awesome");
	  
	  System.out.println("String value :"+s);
	  System.out.println("StirngBuffer value: "+buffer1);
	  System.out.println("StringBuilder value: "+builder);
	  		
  }
  void meth2()
  {
	  String s1=new String("java");
	  String s2=new String("java");
	  
	  StringBuffer buffer1=new StringBuffer("java");
	  StringBuffer buffer2=new StringBuffer("java");
	  
	  StringBuilder builder1 =new StringBuilder("java");
	  StringBuilder builder2 =new StringBuilder("java");
	  
	  System.out.println("---Checking working of equals()--");
	  System.out.println(s1.equals(s2));//true//checking the address location
	  System.out.println(buffer1.equals(buffer2));//false
	  System.out.println(builder1.equals(builder2));//false
	  
	  
	  System.out.println("-----------==----------");
	  System.out.println(s1==s2);
	  System.out.println(buffer1==buffer2);
	  System.out.println(builder1==builder2);
	  System.out.println("--Checking the contents present in the StringBuffer & StringBuilder");
	  System.out.println(buffer1.toString().equals(buffer2.toString()));//true
	  System.out.println(builder1.toString().equals(builder2.toString()));//true
	
	  
	  
  }
  public static void main(String[] args) 
  {
	//new StringBufferAndBuilder().meth1();
	new StringBufferAndBuilder().meth2();
	
}
}
