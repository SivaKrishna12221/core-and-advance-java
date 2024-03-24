package javatpoint;

public class ClassSuperD extends ClassSuperC
{
  ClassSuperD()
  {
	  System.out.println(super.s);
	  super.meth1();
	  //super();//constructor call must be the first statement
  }
  public static void main(String[] args)
  {
   ClassSuperD cs = new ClassSuperD();
   
}
}
