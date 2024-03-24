package prepInstaPatternPrinting;
import java.util.Scanner;

public class HallowSquarePattern//border only '*' remaining keep space
{
  public static void main(String[] args) 
  {
	/*take one input for rows:
	 *take another input for columns:
	 * then take for loop inside fix row
	 * and another for loop fix column
	 * write If condition for (if(i==1 ||i==row)||(j==1||j==column))
	 
	 */
   Scanner sc= new Scanner(System.in);
   System.out.println("enter row size:");
   int r=sc.nextInt();
   System.out.println("enter column size:");
   int c=sc.nextInt();
   for(int i=1;i<=r;i++)
   {
	   for(int j=1;j<=c;j++)
	   {
		   if((i==1||i==r)||j==1||j==c)
			   System.out.print("*");
		   else
			   System.out.print(" ");
	   }
	   System.out.println();
   }
    
}
}

/*
 * enter row size:
5
enter column size:
5
*****
*   *
*   *
*   *
*****

 */
