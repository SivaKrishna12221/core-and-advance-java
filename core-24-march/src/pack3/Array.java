package pack3;

public class Array
{
	void meth1()
	{
		int arr[]={10,20,30,40,50};
		
		System.out.println("Elements at 0th index position:"+arr[0]);
		System.out.println("Elements at 3rd index position:"+arr[3]);
		System.out.println("Retriving the data from an array by using for loop");
		
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=1;i<=3;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("retriving the data in a reverse order by using for loop");
		
		for(int i=4;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	
	//for loop will be working an index positions.
	/* for each loop:
	 * ============
	 * for-each loop or enhanced for loop both are same.
	 * for-each loop is introduced in Java 1.5 v
	 * for-each loop is used to retrieve the data from Array & Collections.
	 * for-each loop will be working on streaming data***
	 * Means it will not retrieve the data basing on index position;
	 * We can't retrieve the data directly in a reverse order by using for each loop
	 
	 */
		System.out.println("Retriving the data by using for-each loop");
		
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args) 
	{
		new Array().meth1();
		
	}

}
