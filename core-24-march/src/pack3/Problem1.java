/* Given an int array length 3 if there is 2 in the array immediately follwed by a 
 * 3 ,change the element 3 to 0 and return the changed array
 */
package pack3;
import java.util. Arrays;
public class Problem1 
{
	
	int[] meth1()
	{
		int arr[]= {2,3,2};
	 for (int i=0;i<arr.length-1;i++)
	 {
		if(arr[i]==2 && arr[i+1]==3) 
			arr[i+1]=0;
	 }
	 return arr;
	 
	}
	public static void main(String[] args) 
	{
		Problem1 aobj=new Problem1();
		int result[]=aobj.meth1();
		System.out.println(Arrays.toString(result));
		
	}

}
