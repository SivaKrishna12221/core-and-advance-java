package abstraction;

public abstract class ClassAbs
{
   abstract void meth1();
   void meth2()
   {
	   System.out.println("instance method executed in abstract class");
   }
   ClassAbs()
   {
	   System.out.println("Constructor executed");
   }
   static void meth3()
   {
	   System.out.println("Static methods executed in abstract class ");
   }
   public static void main(String[] args) 
   {
	System.out.println("main method for abstract class");
   // ClassAbs abs= new ClassAbs();//we cant
}
}
