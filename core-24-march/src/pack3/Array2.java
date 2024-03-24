package pack3;
import java.util.Arrays;
import java.util.Scanner;
//creating list of data;

public class Array2 
{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
	System.out.println("How many elements do you want to store :");
	int len =sc.nextInt();
	int arr[]=new int[len];
	System.out.println("please enter "+len+" int elements");
	
	
    for(int i=0;i<=arr.length-1;i++)
    {
    	arr[i]=sc.nextInt();
    	
    }
    	
    System.out.println("Data entered");
    System.out.println(Arrays.toString(arr));
  
	}
	void meth2()
	{
		System.out.println("Which movie you want to watch ?");
		String movie_name=sc.next();
		System.out.println("How many tickets you need?");
		int no_OfTickets=sc.nextInt();
		String names[]=new String[no_OfTickets];
		System.out.println("Please enter"+no_OfTickets+"names");
		for( int i=0;i<=names.length-1;i++)
		{
			names[i]=sc.next();
		}
		System.out.println("You have booked "+movie_name+"movie tickets to"+Arrays.toString(names));
	}
	public static void main(String[] args)
	{
		//new Array2().meth1();
		new Array2().meth2();
		
	}
}
