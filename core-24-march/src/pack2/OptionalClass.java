package pack2;

import java.util.Optional;

public class OptionalClass
{
  void meth1()
  {
	  System.out.println("Implementing Optional Class");
	  String arr[]=new String[5];
	  arr[1]="Siva krishna";
	  arr[2]="SAI CHANDAHANA";
	  System.out.println(arr[1].toUpperCase());
	  System.out.println(arr[2].toLowerCase());
	  Optional<String> o=Optional.ofNullable(arr[3]);//it show optional information without showing any exception.
	  System.out.println(o);
	  if(o.isPresent())
	  {
		  System.out.println("data is present");
		  System.out.println(o.get());
	  }
	  else
	  {
		  System.out.println("its empty");
	  }
  }
  public static void main(String[] args) 
  {
	  new OptionalClass().meth1();
	
}
}
