package oct2023;

public class StringClass 
{
	
	public void meth1()
	{
		System.out.println("siva");
	}
	public int meth1(int a)
	{
		System.out.println("ram");
		return a;
	}
 public static void main(String[] args) {
	 String s="siva";
	 String s3=new String("siva");
	 String s2="siva";
	 s=s.concat("krishna");
	 System.out.println(s.hashCode());
	 System.out.println(s2.hashCode());
	 System.out.println(s3.hashCode());
	 System.out.println(s3==s2);
	 StringClass obj=new StringClass();
	 System.out.println(s.toString());
}
}
