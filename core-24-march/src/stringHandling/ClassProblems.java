package stringHandling;

public class ClassProblems 
{
	void meth1()
	{
		char []arr= {'s','i','v','a'};
		String s=new String(arr);
		System.out.println(s);
		byte []arr2=s.getBytes();
		for(byte x:arr2)
		{
		
			System.out.println((char)x);
		}
	}
	String meth2(String s)
	{
		return "hllo".concat(s);
	}
	String meth3(String s,String s2)
	{
		return s+s2+s2+s;
	}
	String meth4(String s,String s2)
	{
		return s.substring(0,2)+s2+s.substring(2);
	}
	String meth5(String str)
	{
		String s=str.substring(2);
		return s+s+s;
	}
 public static void main(String[] args) 
 {
	ClassProblems cobj=new ClassProblems();
	//cobj.meth1();
	String result=cobj.meth2(" Bob");
	System.out.println(result);
    String result2=cobj.meth3("hi","bye");
    System.out.println(result2);
    String result3=cobj.meth4("<<>>","Java");
    System.out.println(result3);
    String result4=cobj.meth5("siva");
    System.out.println(result4);
    
}
 
}
