package pack2;

import java.util.Iterator;
import java.util.Vector;

public class UserDefinedObjectB 
{
	
void meth1()
{
	System.out.println("implementing userdefined objects in vector class");
	Vector<Object> v=new Vector<Object>();
	UserdefinedObjectA aobj1=new UserdefinedObjectA(101,"sbi","kmp");
	UserdefinedObjectA aobj2=new UserdefinedObjectA(102,"apgb","adrod");
	v.add(aobj1);
	v.add(aobj2);
	v.add(new UserdefinedObjectA(104,"canara","kadapa"));
	v.add(new UserdefinedObjectA(103,"union","srNagar"));
	System.out.println(v);
	System.out.println("retriving the data by using iterator interface");
	Iterator<Object> i=v.iterator();
	while(i.hasNext())
		System.out.println(i.next());
	
}
public static void main(String[] args)
{
	new UserDefinedObjectB().meth1();
	
}
}
