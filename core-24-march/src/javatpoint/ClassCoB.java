package javatpoint;

public class ClassCoB extends ClassCoA
{
  ClassCoB get()
  {
	  System.out.println("siva");
	  return this;
  }
  void msg()
  {
	  System.out.println("understanding covarient return type");
  }
  public static void main(String[] args)
  {
	
    ClassCoB c=new ClassCoB();//which object you created that object class methods executed
    c.get();
    ClassCoA cc2=new ClassCoA();
    cc2.get();
    //cc2.msg();
}
 
}
