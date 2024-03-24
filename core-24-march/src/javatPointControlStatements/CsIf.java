package javatPointControlStatements;

public class CsIf 
{
 public static void main(String[] args)
 {
   String address="Delhi,India";
   if(address.endsWith("India"))
   {
	   if(address.contains("Meerat"))
	   {
		   System.out.println("your city is meerut");
	   }
	   else if(address.contains("noida"))
	   {
		   System.out.println("your city is noida");
	   }
	   else    
	   {
		 System.out.println(address.split(",")[0]);  
	   }
   }
   else {
	   System.out.println("your not living in India");
   }
  
}
}
