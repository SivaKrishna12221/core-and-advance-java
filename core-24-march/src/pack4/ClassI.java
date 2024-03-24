package pack4;

public class ClassI extends ClassH
{
	void meth2()
	{
		System.out.println("ClassI method");
	}
	public static void main(String[] args)
	{
		ClassH hobj=new ClassH();
		hobj.meth1();//Is a relation
		/*
		 * we can hold parent class object with parent class reference in that reference
		 * we can  call parent class methods
		 */
		
		ClassH hobj1=new ClassI();
		hobj1.meth1();
		/*
		 * we can hold child class object with parent class reference in that reference 
		 * we can call parent class methods
		 */
		ClassI iobj=new ClassI();
		iobj.meth2();
		iobj.meth1();
		/* 
		 * we can hold child class object with child class reference in that referenc
		 * we can call both child class methods and parent class methods
		 */
	     //ClassI iobj =new ClassH();
	     /* 
	      * we cannot hold parent class methods with child class reference if we  trying
	      * to do that we will be getting an compile time error.
	      */
	}

}
