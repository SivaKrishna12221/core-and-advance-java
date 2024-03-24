package javatPointString;

public class ConversionOfStringIntoInt 
{
  public static void main(String[] args)
  {
	String s="50346";//this is in the form of String
	//it can be converted into int..by using parseInt() method
	int i=Integer.parseInt(s);
	System.out.println(s);
	//trying concatination operator
	System.out.println(s+100);//concatination occured  to the string
    //trying to add the value to the integer 
	System.out.println(i+100);
	
	String s2="200";//declaring a string
	//converting string into integer using Integer.valueOf()
	Integer i2=Integer.valueOf(s2);
	System.out.println(i2);
	
}
}
