package javatPointString;

public class ClassString 
{
 public static void main(String[] args) {
	System.out.println("hashcode test of string");
	String str="java";
	System.out.println(str.hashCode());
	str=str+" is awesome";//new object will be created
	System.out.println(str.hashCode());
	System.out.println("hashcode test of Strinng buffer");
	StringBuffer sb=new StringBuffer("java");
	System.out.println(sb.hashCode());
	sb.append(" is awesome");//object not changed
	System.out.println(sb.hashCode());//same
	
}
}
