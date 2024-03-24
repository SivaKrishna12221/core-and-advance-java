package javatPointString;

public class ClassEquals
{
  public static void main(String[] args) {
	String s1=new String("java");
	System.out.println(s1.equals("java"));
	System.out.println(s1.equals("JAVA"));
	
	System.out.println("+====");
	String str="a";
	String str1="123";
	String str2="45.89";
	String str3="false";
	Character c=new Character('a');
	Integer i=new Integer(123);
    Float f=new Float(45.89);
    Boolean b=new Boolean(false);
    //reference of the Character object is passed
    System.out.println(str.equals(c));
    //reference of the Integer Object is passed
    System.out.println(str.equals(i));
    System.out.println(str.equals(f));
    //to achieve true value ,we have to convert string
    System.out.println(str.equals(c.toString()));
    System.out.println(str1.equals(i.toString()));
    System.out.println(str2.equals(f.toString()));
    System.out.println(str3.equals(b.toString()));
    
    System.out.println("equalsIgnoreCase");
    String str4="hello world";
    System.out.println(str4.equalsIgnoreCase("HELLO world"));
    
}
}
