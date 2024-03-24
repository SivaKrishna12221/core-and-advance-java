package abc;

public abstract  class ClassStaticAbstract 
{
// static  abstract void meth1()
	final static int a;
   public static void meth1()
   {
	   System.out.println("static method executed");
	   
   }
   static {
	 System.out.println(a=10);
	 // a static block can be initialized final static varibles;
   }
   
   
  public static void main(String[] args) {
    meth1();
  }
  }

