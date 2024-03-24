package java8;

import java.util.function.Predicate;

interface CheckValue
{
	static boolean meth1(int a)
	{
		if(a>10) {
			return true;
		}
		else
			{return false;
			
			}
	}
}
//instead using our predefined methods to find true or false  we can use prefined Functional interface

public class PredicateInterface {

	public static void main(String[] args) {
	//	System.out.println(CheckValue.meth1(30));
	    
		
		Predicate<Integer> p=a->a>10;//lambda take input return true  or false
		
	    System.out.println(p.test(3));//false
	    
	     Predicate<String> str= name->name.startsWith("s");
	    Predicate<String> str3=name->name.charAt(0)=='r';
	    String name[]= {"siva","sitha","ravi","raja"};
	    for(int i=0;i<name.length;i++)
	    {
	    	if(str.test(name[i]))System.out.println(name[i]);
	    	System.out.println("========");
	        if(str3.test(name[i]))System.out.println(name[i]);
	    }
	    
	}
	
}
