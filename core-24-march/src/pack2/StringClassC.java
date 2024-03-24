package pack2;
import java.util.Scanner;

public class StringClassC 
{
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your gender(m/f):");
		char gender=sc.next().charAt(0);
		switch(gender)
		{
		case 'M':
			System.out.println("user is male");
			break;
		case 'm':
			System.out.println("user is male");
			break;
		case 'F':
			System.out.println("user is female");
			break;
		case 'f':
			System.out.println("user is female");
			break;
		default:
			System.out.println("invalid input");
			break;
		
		
		}
	}
	void meth2()
	{
		char arr[]= {'A','B','C','D','E','F'};
		String s=new String(arr);
		System.out.println("s value:"+s);
		System.out.println("-----------");
	    byte arr2[]=s.getBytes();
	    for(byte x:arr2)
	    {
	    	System.out.print((Byte)x +" ");
	    }
	}
	public static void main(String[] args) 
	{
	  StringClassC cobj=new StringClassC();
	  cobj.meth1();
	  cobj.meth2();
		
	}
	

}
