package javatPointString;

public class ClassStringMethods 
{
	public static void main(String[] args) 
	{
		String s1=new String("sachin");
		String s2=s1.intern();
		System.out.println(s2);
		int a=10;
		String s3=String.valueOf(a);
		System.out.println(s3+10);
		String s4="sachin was a best player in India";
	    String s5=s4.replace("sachin","tendulkar");
	    System.out.println(s5);
	   StringBuffer s6=new StringBuffer("siva");
	   s6.insert(2,"ai");
	   System.out.println(s6);
	   s6.replace(1,3,"sai");
	   System.out.println("replace:"+s6);
	   System.out.println(s6.delete(1, 4));
	   System.out.println(s6.reverse());
	   System.out.println(s6.capacity());
	   s6.append(" leaning java and go the lab");
	   System.out.println(s6.capacity());
	}

}
