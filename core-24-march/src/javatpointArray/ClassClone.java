package javatpointArray;

public class ClassClone 
{
public static void main(String[] args) {
	int arr[]= {10,20,40,50};
	System.out.println("printing arr values");
	for(int crr:arr)
	{
		System.out.println(crr);
	}
	System.out.println("printing clone values");
	int carr[]=arr.clone();
	for(int c:carr)
	{
		System.out.println(c);
	}
}
}
