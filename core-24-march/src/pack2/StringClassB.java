package pack2;

public class StringClassB 
{
 void meth1()
 {
	 String s1="java";
	 String s2=new String("java");
	 String s3="java";
	 String s4=new String("java");
	 System.out.println("====eqauls======");//it checks the content present in the strings
	 System.out.println(s1.equals(s2));//true
	 System.out.println(s2.equals(s3));//true
	 System.out.println(s3.equals(s4));//true
	 System.out.println(s1.equals("java"));//true
	 System.out.println("java".equals("java"));//true
	 System.out.println("JAVA".equals("java"));//false
	 System.out.println("============");
	 System.out.println("double eqauls method :it is going to check the address loc"
	 		+ "ation of the String class object");
	 System.out.println(s1==s2);//false
	 System.out.println(s2==s3);//false
	 System.out.println(s1==s3);//true
	 System.out.println(s2==s4);//false
	 System.out.println(s1==new String("java"));//false
	 System.out.println(new String("java")==new String("java"));//false
	 System.out.println(s1=="java");//true
	 System.out.println("java"=="java");//true
	 System.out.println("============= String Class methods");
	 System.out.println("length:"+s1.length());//4
	 System.out.println("concat();"+s1+"is".concat("awesome"));//java is awesome
	 System.out.println("s1 value:"+s1);//java
	 System.out.println("java is awe".concat("some").length());//java is awesome//15
	 System.out.println("CharAt():"+s1.charAt(3));//A
	 System.out.println("CharAt():"+s1.charAt(s1.length()-2));//v
	 System.out.println("CharAt():"+s1.charAt('A'-64));//A
	 System.out.println("equalsIgnoreCase():"+"Java".equalsIgnoreCase("java"));//true
	 System.out.println("startsWith():"+s1.startsWith("j"));//true
	 System.out.println("startsWith():"+"Java is awesome".startsWith("ja".concat("va")));//false
	 System.out.println("tolowerCase():"+s1.toLowerCase());
	 System.out.println("toupperCase():"+s1.toUpperCase());
	 System.out.println("substring():"+s1.substring(1));//ava
	 System.out.println("substring():"+s1.substring(s1.length()-1));//a
	 System.out.println("substring():"+s1.substring(0,3));//jav
	 System.out.println("=============");
	 String s5="java is awesome";
	 System.out.println("substring():"+s5.substring(3,9));
	 System.out.println("replace():"+s1.replace('a', 'A'));
	 String s6="hello world";
	 System.out.println(s6.length());
	 System.out.println("trim():"+s6.trim().length());
	 System.out.println("index of():"+s6.indexOf('o'));
	 System.out.println("index of():"+s6.indexOf('e'));
	 
	 
 }
 public static void main(String[] args)
 {
	 StringClassB bobj=new StringClassB();
	 bobj.meth1();
	
}
}
