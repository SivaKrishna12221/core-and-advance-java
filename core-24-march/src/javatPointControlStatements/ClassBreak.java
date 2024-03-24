package javatPointControlStatements;

public class ClassBreak
/*
 * jump statements are used to transfer the control of the program to
 * specific statement.or in other words jump statements transfer the control of other part of the program
 */
/*break:
 * the break statement suggest to break the current flow of program and 
 * transfer the control to the next statement outside the loop or swith statement;
 * it breaks only inner loop in the case of the nested loop
 * 
 * continue:
 * Unlike break statement ,the continue statement doesn't break the loop whereas,
 * it skips the specific part of the loop and jumps to next iteration of the loop immediately
 */
{
  public static void main(String[] args) {
	for(int i=1;i<=10;i++)
	{
		System.out.println(i);
		
		if(i==6)
	     break;
	}
	for (int i=10;i<=20;i++)
	{
		System.out.println(i);
		if(i==15)
			continue;
		
	}
	for(int i=0;i<=2;i++)
	{
		for(int j=i;j<=5;j++)
		{
			if(j==4)
			{
				continue;
		}
		System.out.println(j);
	}
}}
}
