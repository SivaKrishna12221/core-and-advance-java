package pack2;
import java.util.HashSet;
import java.util.Iterator;

public class ClassASet 
{
	void meth1()
	{
		System.out.println("Implemting set interface ");
		HashSet<Object> hs=new HashSet<Object>();
		hs.add(10);//Insertion order is not maintained
		hs.add("siva");//heterogeneous data is allowed
		hs.add(null); //nulls are accepted
		hs.add(10);//duplicate values are not allowed
		hs.add(23);//It is available from java 1.2 version
		hs.add(70);//Its default capacity is 16(load factor :0.75)
		hs.add(89);//It size increases by double
		hs.add(45);//It is not synchronized
		hs.add(34);
		hs.add(43);
		System.out.println(hs);
		System.out.println("==============Iterator=======");
	    Iterator<Object> i=hs.iterator();
	    while(i.hasNext())
	    	System.out.print(i.next()+" ");
	    System.out.println();
	    System.out.println("------------------");
	   
	    
	}
	public static void main(String[] args)
	{
		new ClassASet().meth1();
	}

}
