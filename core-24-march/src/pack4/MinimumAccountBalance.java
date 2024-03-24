package pack4;

public class MinimumAccountBalance extends Exception

{
String message ;
public MinimumAccountBalance (String message)//parameterized constructor
{
	this.message=message;//calling to string method
}
public String toString()
{
	return message;
	
}

}