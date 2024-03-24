package java8;

interface IMyInterface
{
	public int meth1(int a,int b);
    default void  meth2(int a,String name)
    {
    	System.out.println("writing default methods in functional interface");
    }
	
}
class Implementations implements IMyInterface
{
	@Override
	public int meth1(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void meth2(int a, String name) {
		// TODO Auto-generated method stub
		
		System.out.println("implementaions");
	
		
	}
}
public class FunctionalInterface {

	public static void main(String[] args) {
		/*IMyInterface add=(a,b)->{
			System.out.println(a+b);
			return a+b;//if the body contain one state ment no need to use return 
		};*/
		
	  // System.out.println(add.meth1(10,30));
	   Implementations implementations = new Implementations();
	   implementations.meth2(10,"siva");
	}
}
