package pack1;

public class ClassMultiplication 
{
  void meth1(int num)
  {
	  System.out.println("multiplication table of"+num);
	  for(int i=1;i<=10;i++)
	  {
		  System.out.println(num+"*"+i+"="+(num*i));
	  }
  }
  public static void main(String[] args) 
  {
	  new ClassMultiplication().meth1(12);
		
}
}
