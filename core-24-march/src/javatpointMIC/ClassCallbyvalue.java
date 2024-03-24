package javatpointMIC;

public class ClassCallbyvalue 
{
  int data=50;
  void change(int n)
  {
  data=data+100;//changes will be in the local variable
  
}
  public static void main(String[] args) 
  {
	ClassCallbyvalue aob=new ClassCallbyvalue();
	System.out.println(aob.data);
	aob.change(10);
	System.out.println(aob.data);
}
}
