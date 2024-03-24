package pack2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListA 
{
	void meth1()
	{
		System.out.println("implementing an array list");
		//In order to create an ArrayList we should create new ArrayList Class
		//ArrayList al=new ArrayList();//creating an array Class
		ArrayList<Integer> al=new ArrayList<Integer>();//implementing wrapper Classes
		al.add(10);
		//al.add("java");//heterogeneous data can be prepared
		al.add(null);//Nulls also accepted
		al.add(23);// default capacity of ArrayList is 10;
		al.add(23);//the size increases by (current size * 3/2)-1);
		al.add(43);//duplicates values can allowed.
		al.add(233);//we can  insert values between the objects
		//al.add(true);
		//al.add('A');
		//al.add((byte)20);
		System.out.print(al);//here we are getting an array by simple access with 
		// the help of identifier name
		System.out.println();
		System.out.println("ArrayListSize:"+al.size());//to find out the size of an arrayList
		System.out.println("Get value:"+al.get(al.size()-1));
		System.out.println("====================");
		System.out.println("Retrieving the data by using for loop ");
		for (int i=0;i<=al.size()-1;i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("============");
		System.out.println("Retriving the data in reverse order");
		for (int i=al.size()-1;i>=0;i--)
			
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("===========================");
		
		System.out.println("Retrieving the data by using for each loop");
	    for(Integer o:al)
	    {
	    	System.out.print(o+" ");
	    }
	    System.out.println();
	    System.out.println("============================");
	    System.out.println("Retreving the data by using iterator Interface");
	    /*
	     * Iterator interface is an interface which contains methods to retrieve the
	     * elements one by one from collection object.It Retrieves only in forward direction.
	     */
	    Iterator<Integer> i=al.iterator();//itself it is a class and method
	    while(i.hasNext())//It depends on cursor ..if the cursor is present in left of the object it is true.
	    {
	    	System.out.print(i.next()+" ");//here after printing an object.and again check the while condition.
	    }
	    /*
	     * Iterator<integer>i=al.iterator();//i  is reference
	     * while(i.hasNext())
	     * {
	     * System.out.print(i.next());
	     * }
	     */
	    System.out.println();
	    System.out.println("======methods============");
	    al.add(1,1000);
	    System.out.println(al);
	    al.add(5,123);
	    System.out.println(al);
	    al.remove(2);
	    System.out.println(al);
	    al.remove(5);
	    System.out.println(al);
	}
	public static void main(String[] args) 
	{
		 ArrayListA aobj=new ArrayListA();
		 aobj.meth1();
		
	}

}
