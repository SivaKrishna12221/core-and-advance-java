package abc;

public  class ClassStatic extends ClassStaticA
{
   int a=10;
   static String collage="yvu";
    static int  meth1(int a)
   {
	   System.out.println(a);
	   System.out.println(collage);
	   return a;
   }

	/*
	 * static void meth2() { // System.out.println(a);//we can't access non static
	 * data members directly System.out.println(new ClassStatic().a);//we can with
	 * help of respective class object System.out.println(collage); }
	 */
   //static ClassStatic ()c.e 
   {
	   System.out.println();
   }
   
   public static void main1(String[] args) 
   {
	  System.out.println();
	ClassStatic cs=new ClassStatic();
	System.out.println(cs.meth1(10));
     //meth2();//we can call directly without creating an object
}
   
}
