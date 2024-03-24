package pack3;

public class StringMethods 
{
	void meth1()
	{
		String s1="Java";
		String s2=new String("Java");
		String s3="Java";
		String s4= new String("Java");
		
		System.out.println("----equals------");
		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("Java"));
		System.out.println("Java".equals("Java"));
		System.out.println("JAVA".equals("java"));//false
		
		/*equals():
		 * equals() in String class has been overridden such that it is going to check
		 * the contents present in the strings
		 */
		System.out.println("------==----");
		System.out.println(s1==s2);//false
		System.out.println(s2==s3);//false
		System.out.println(s3==s1);//true
		System.out.println(s3==s4);//false
		System.out.println(s1==new String("Java"));//false
		System.out.println(new String("Java")==new String("Java"));//false
		System.out.println(s1=="Java");//true
		/*==;
		 * It is going to check the address locations of the string class objects
		 */
		System.out.println("-------");
		System.out.println("----String Class methods---");
		System.out.println("length():"+s1.length());//4
		System.out.println("concat():"+s1+" is ".concat("awesome"));//Java is awesome
		System.out.println("s1 value:"+s1);//Java
		System.out.println("Java is awe".concat("some").length());//15
		System.out.println();
		
		System.out.println("charAt():"+s1.charAt(2));//v
		System.out.println("charAt():"+s1.charAt(s1.length()-2));//A
		System.out.println("charAt():"+s1.charAt('A'-64));//A
		System.out.println("equalsIgnoreCase():"+"Java".equalsIgnoreCase("JaVA"));//true
		System.out.println("startsWith():"+s1.startsWith("J"));//true
		System.out.println("startsWith():"+s1.startsWith("J"));//true
		System.out.println("startsWith():"+" Java is awesome ".startsWith("Ja".concat("va")));//false
		System.out.println("toLowerCase():"+s1.toLowerCase());//java
		System.out.println("s1 value:"+s1);
		System.out.println("toUpperCase():"+s1.toUpperCase());//JAVA
		System.out.println();
		System.out.println("substring():"+s1.substring(1));//ava
		System.out.println("substring()"+s1.substring(s1.length()-1));//a
		System.out.println("substring():"+s1.substring(0,3));//jav
		System.out.println();
		String s5="Java is awesome";
		System.out.println("substring():"+s5.substring(3,9));//a is awes
		System.out.println("replace():"+s1.replace('a', 'A'));//jAvA
		System.out.println();
		String s6=" Hello world ";
		System.out.println(s6.length());//13
		System.out.println("trim():"+s6.trim().length());//11
		System.out.println("indexOf():"+s6.indexOf('o'));//5
		System.out.println("indexOf():"+s6.lastIndexOf('o'));//8
	}
public static void main(String[] args)
{
	new StringMethods().meth1();
}
}
