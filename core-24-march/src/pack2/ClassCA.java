package pack2;

public class ClassCA
{
 int a=10;
 static int b=20;
 
      static class  InnerClassA
	 {
		 void meth1()
		 {
			 System.out.println(new ClassCA().a);
			 System.out.println(b);
		 }
		 static 
		 {
			 System.out.println("inner Class Static block");
		 }
		 InnerClassA()
		 {
			 System.out.println("inner class Constructor");
		 }
		 public static void main(String[] args) 
		 {
			new InnerClassA().meth1();
		 }
		 
		 
	 }
      static 
      {
    	  System.out.println("Outer class Static block");
      }
      ClassCA()
      {
    	  System.out.println("Outer Class constructor");
      }
     public static void main(String[] args)
     {
    	 System.out.println("Java is awesome");
    	 ClassCA.InnerClassA iobj=new ClassCA.InnerClassA();
    	 iobj.meth1();
    	 
     }
 }
/*for outer Class
 * outer Class static block executed
 * java is awesome
 * inner class static block is executed
 * inner Class constructor executed
 * outer class constructor
 * 10
 * 20 
 * 
 *
/*
 * for Inner Class 
 * inner class static block 
 * inner class constructor 
 * outer class static block
 * outer class constructor
 * 10
 * 20
 */

