package abc;

import java.io.Console;

public class ClassConsole 
{
  public static void main(String[] args) {
	Console c=System.console();
	System.out.println("enter your name");
	String name=c.readLine();
	/*
	 * System.out.println("enter your phone number"); String pho=c.readLine();
	 */
	System.out.println(name);
}
}
