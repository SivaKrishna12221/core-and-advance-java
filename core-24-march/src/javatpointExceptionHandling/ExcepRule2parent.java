package javatpointExceptionHandling;

import java.io.IOException;

public class ExcepRule2parent
{
 void msg()throws IOException
 {
	 System.out.println("parent class declare io exception,then sub"
	 		+ "child class overidden method should same exception or child excption but not declare parent Exception");
 }
}
