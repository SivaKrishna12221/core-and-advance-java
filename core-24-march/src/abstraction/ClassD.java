package abstraction;
/*
 * Resolving the ambiguity which occurs in multiple Inheritance by
 * using Interfaces
 */
public class ClassD implements InterfaceC,InterfaceD
{
 public void meth1()
 {
	InterfaceC.super.meth1();
	InterfaceD.super.meth1();
 }
 public static void main(String[] args)
 {
	new ClassD().meth1();
}
}
