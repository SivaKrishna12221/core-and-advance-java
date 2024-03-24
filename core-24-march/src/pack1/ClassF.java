package pack1;

public class ClassF extends ClassE
{
   void display()
   {
	   System.out.println("hi");
	   super.meth4();
   }
   static int show(int a)//a=50
   {
	   System.out.println(a+a);
	   return a+a++;//51
	   
   }
   ClassF()
   {
	   this(show(50));//parameterized call
	   for(int i=1;;i++)
	   {
		   super.meth4();//condition true 
		   break;
	   }
	   System.out.println("hi");
	   System.out.println(show(50));
   }
   ClassF(int a)
   {
	   System.out.println("==>"+(a++ + show(50)));
   }
   public static void main(String[] args)
   {
	   new ClassF().display();//ClassF() default constructor.
	
}
}
