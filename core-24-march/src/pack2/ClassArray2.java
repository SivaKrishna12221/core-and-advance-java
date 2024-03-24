package pack2;
import java.util.Arrays;
import java.util.Scanner;
public class ClassArray2 
{
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("How many elements you want to store:");
	    int len=sc.nextInt();
	    int arr[]=new int[len];
	    System.out.println("please enter "+len+" elements");
	    for (int i=0;i<=arr.length-1;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println("data entered ");
	    System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args)
	{
		new ClassArray2().meth1();
		
	}

}
