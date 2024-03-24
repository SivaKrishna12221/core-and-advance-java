package javatPointControlStatements;
/*
 * while:
 * the while loop is also used to iterate over the number of statements multiple times
 * if we dont know the number of iterations in adavance .it is recommended to use a while loop
 * unlike for loop ,the initialization and increment doesnot take place inside a while loop
 */
public class ClassDowhile 
/*
 * the doWhile loop check the condition at the end of the loop
 * after execution of loop statements.when the number of iteration is not known
 * and we have to execute our loop atleast one time we can use do while loop
 */
{
 public static void main(String[] args) {
	int i=0;
	System.out.println("print i values");
	do
	{
		System.out.println(i);
		i=i+3;
		
	}
	while(i>=10);
}
 
}
