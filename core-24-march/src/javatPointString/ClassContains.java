package javatPointString;

public class ClassContains 
{
  public static void main(String[] args) {
	String name="what do you know about me";
	System.out.println(name.contains("do you know"));
	System.out.println(name.contains("about me"));
	System.out.println(name.contains("hello"));//false
	System.out.println(name.contains("what"));
	System.out.println("===========");
	String str="hello javatpoint readers";
	boolean isContains=str.contains("Javatpoint");
	System.out.println(isContains);
	//Case Sensitive
	System.out.println(str.contains("javatpoint"));
	System.out.println("=================");
	String s1=new  String("java");
	System.out.println(s1.endsWith("a"));
	String s2="Welcome to JavaTpoint";
	System.out.println(s2.endsWith("javaTpoint"));//false
	System.out.println(s2.endsWith("javatpoint"));//false
	System.out.println(s2.endsWith("JavaTpoint"));//true
	
}
}
