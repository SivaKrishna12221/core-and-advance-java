package stringHandling;

public class ClassStringBuffer_builder 
//String Buffer and builder are mutable that means we can the object
// of String Buffer class and String Builder Class.
{
  void meth1()
  {
	  String s=new String("java");//string class object
	  StringBuilder builder=new StringBuilder("java");//buffer class object
	  StringBuffer buffer=new StringBuffer("java");
	  s.concat("is awesome");//we can't change the string class object
	  buffer.append("is awesome");//we can change here
	  builder.append("is awesome");//we can change here
	  System.out.println("string value:"+s);//because String class or immutable
	  
	  System.out.println("String buffer:"+buffer);
	  System.out.println("string builder:"+builder);
	  String s1= new String("java");
	 
	  String s2= new String("java");
	  StringBuilder builder1=new StringBuilder("java");//buffer class object
	  StringBuffer buffer2=new StringBuffer("java");
	  
	  System.out.println(s1.equals(s));//true
	  System.out.println(builder.equals(builder1));//it checks the adderres location
	  System.out.println(buffer==buffer2);//it checks address location
	  System.out.println("equls method check the address location of buffer 1 and buffer 2");
	  System.out.println(buffer.toString().equals(buffer2.toString()));
  }
  void meth2()
  {
	 StringBuffer sb=new StringBuffer(); //creating string buffer object
	 System.out.println("capacity:"+sb.capacity());//16
	 sb.append("abcd");
	 System.out.println("length:"+sb);
	 System.out.println(sb.length());
	 sb.append("efghijklmnop");
	 System.out.println(sb);
	 System.out.println(sb.length());
	 sb.append("q");
	 System.out.println(sb.capacity());
	 System.out.println(sb.substring(2,4));
	 System.out.println(sb.reverse());//reverse
  }
  
  public static void main(String[] args)
  {
	  ClassStringBuffer_builder aobj=new ClassStringBuffer_builder ();
	  aobj.meth1();
	  aobj.meth2();
}
}
