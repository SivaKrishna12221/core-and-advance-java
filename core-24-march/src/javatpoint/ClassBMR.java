package javatpoint;

public class ClassBMR extends ClassMR
{
    public void meth1(int a,int b)//over riding method
    {//child class method should not be more restrictive than the parent  class method
    	System.out.println("child method");
    	System.out.println(a+b);
    }
	public static void main(String[] args) 
	{
		ClassMR  mrobj=new ClassMR();
		mrobj.meth1(10,20);
		ClassMR mrobj1=new ClassBMR();
		mrobj1.meth1(10,30);
	}

}
