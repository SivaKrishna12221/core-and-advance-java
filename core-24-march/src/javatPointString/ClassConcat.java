package javatPointString;

public class ClassConcat 
{
   public static void main(String[] args) {
	String s1=new String("hello");
	String s2=new String("world");
	String s3=new String("how are you");
	String s4=new String();

	
	System.out.println(s1);
	s4=s1.concat(" ").concat(s2).concat(" ").concat(s3);
	System.out.println(s4);
	String s5=s1.concat("!!!");
	System.out.println(s5);
	String s6=s1.concat("@").concat(s2);
	System.out.println(s6);
	String s7="country";
	String s8="India is my ".concat(s7);
	System.out.println(s8);
}
}
