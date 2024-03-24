package javatpointMIC;

public class ClassWrapper2 
{//The auto matic conversion of wrapper into corresponding primitive data type is called auto unboxing
  public static void main(String[] args) 
  {
	Integer a=new Integer(10);//wrapper class obj 10
	int  i=a;// here implicitly converting object into class
	int j=a.intValue();//here explicitly converting integer to int
	
	System.out.println(a+" "+i+" "+j);
}
}
