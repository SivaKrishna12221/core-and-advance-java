package javatPointString;

public class ClassStringBuffer
{
  public static void main(String[] args) {
	StringBuffer sb=new StringBuffer();//create an empty string buffer with the initial capacity of 16
	StringBuffer sb1=new  StringBuffer("siva");//creates a string buffer with String values
	StringBuffer sb2=new StringBuffer(10)	;//	creates empty string buffer with specified capacity
	sb.append(10);//append method is overloaded method like it accepts string,int,float,double ,char,..
	
	sb.append(20);
	sb.append("hello");
	sb.insert(9,"java");//sychronized string buffer//it used to insert specify string with this string with specified index location
	sb.insert(1, 23);
	
	sb.replace(9,14,"world");//it used to replace a string with some indexpostion to some indexpostion
    sb.delete(9,14);//hello world deleted
	sb.ensureCapacity(10);
	System.out.println(sb.reverse());
	System.out.println(sb.capacity());
	System.out.println(sb.charAt(3));

}
}
