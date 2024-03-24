package pack2;

public class StringClassD 
{
	void meth1(String word)
	{
		System.out.println("Cheking the  string weather it is a palendrome");
		int len=word.length();
		String s=" ";
		for(int i=len-1;i>=0;i--)
		{
			s=s+word.charAt(0);
		}
		System.out.println("Reverse of a String:"+s);
	}
public static void main(String[] args) 
{
	StringClassD dobj=new StringClassD();
	dobj.meth1("siva");
}
}
