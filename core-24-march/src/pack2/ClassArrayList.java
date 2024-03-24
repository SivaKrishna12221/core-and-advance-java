package pack2;
import java.util.ArrayList;
import java.util.Iterator;
public class ClassArrayList
{
	void meth1()
	{
		System.out.println("Implementing Array List");
	    ArrayList<Integer> al=new ArrayList<Integer>();
	    al.add(10);//insertion order is maintained
	    
	  //al.add("java");//heterogeneous data is allowed
	  //al.add(null);//nulls  are allowed
	    al.add(10);//duplicates are allowed
	    al.add(19);//It is available from java 1.2 v
	 // al.add((int)'A');//Its default capacity is :10
	    al.add(29);//Its size increases by (current *3/2)-1 (half)
	    al.add(43);//It is not synchronized
	    al.add(89);
	    System.out.println(al);
	    System.out.println("size:"+al.size());//9
	    System.out.println("get():"+al.get(al.size()-1));//89 last position
	    System.out.println("--------------------------");
	    System.out.println("Retervig the data  by using for loop");
	    for(int i=0;i<=al.size()-1;i++)
	    {
	    	System.out.print(al.get(i)+" ");
	    }
	    System.out.println();
	    System.out.println("Retriving the data in Reverse order by using for-loop");
	    for(int i=al.size()-1;i<=0;i++)
	    {
	    	System.out.print(al.get(i)+" ");
	    }
	    System.out.println();
	    System.out.println("Retriving the data by using Iterator interface");
	    Iterator<Integer> i=al.iterator();
	    while(i.hasNext())
	    	System.out.print(i.next()+" ");
	    System.out.println(" --");
	    System.out.println("==== methods()=====");
	    al.add(1,1000);
	    System.out.println(al);
	    al.add(5,109);
	   System.out.println(al);
	   al.remove((Object)109);
	   System.out.println(al);
	}
	public static void main(String[] args)
	{
	   new ClassArrayList().meth1();
		
	}
  
	

}
