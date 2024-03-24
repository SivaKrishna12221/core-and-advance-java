package pack2;
/*
 * Given two strings , a and b ,return the result of putting them together in the 
 * order ab-ba,e.g."hi" and "bye" return "hiByeByehi".
 * makeAbba("hi","Bye")?"hibyebyehi"
 */

public class StringCase2 
{
public String makeAbba(String a,String b)//a=hi,b=bye
{
	return a+b+b+a;

}
public static void main(String[] args) 
{
	StringCase2 cobj=new StringCase2();
	String result=cobj.makeAbba("hi","bye");
	System.out.println(result);
}
}