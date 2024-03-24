package abc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClassBufferedInputStream 
{
  public static void main(String[] args) throws Exception{
	  System.out.println("enter name");
	  BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	  String name=reader.readLine();
	  System.out.println("enter id");
	  int id=reader.read();
	  System.out.println(name);
	  System.out.println(id);
}
}
