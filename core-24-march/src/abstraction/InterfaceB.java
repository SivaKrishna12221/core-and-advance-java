package abstraction;

public interface InterfaceB extends InterfaceA
{
   void meth1();
   default void meth2()
   {
	   System.out.println("meth2() called");
   }
   void show();
}
