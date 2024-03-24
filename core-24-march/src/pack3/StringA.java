package pack3;

public class StringA
{
	void meth1()
	{
		String s1="Java";
		String s2=new String("Java");
		char arr[]= {'j','A','V','A'};
		String s3=new String(arr);
		String s4=new String(arr,2,2);
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);
		System.out.println("s1 length is ;"+s1.length());
		System.out.println("Java is awesome".length());
		//Strings which are created  by using string class are Immutable
	}
	void meth2()
	{
		String s="Java";
		System.out.println("Before concatination s value:"+s);
		System.out.println(s.concat("is awesome"));
		//s=s.concat("is awesome");
		System.out.println("After concatination s value :"+s);
	}
	public static void main(String[] args) 
	{
	
	StringA aobj=new StringA();
	aobj.meth1();
	aobj.meth2();
	}

}
