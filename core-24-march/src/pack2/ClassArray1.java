package pack2;

public class ClassArray1
{
	void meth1()
	{
		System.out.println("Implementing Java Array");
		int arr1[];
		arr1=new int[5];
		int arr2[]=new int[5];
		int arr3[]= {100,200,300};
		int arr4[]= new int[]{15,25,35,45,55,65};
		
		String s="Java";
		System.out.println("arr length:"+arr1.length);
		System.out.println("arr length:"+arr2.length);
		System.out.println("arr length:"+arr3.length);
		System.out.println("arr length:"+arr4.length);
		
	//	System.out.println("arr1 length:"+arr1 length());
		System.out.println("String length:"+s.length());
		System.out.println("------------------------");
		
	//index positions  of an array is used to store and retrive the data.
		arr1[1]=11;
		arr1[3]=13;
		//arr1[5]=16;
		//array index out of bounds exception because there is no 5th index position.
		arr1[arr1.length-1]=14;
		arr1[arr3.length-1]=12;
		arr1[arr4.length-arr2.length-2]=10;
		
		
	}
	public static void main(String[] args) 
	{
		new ClassArray1().meth1();
	}

}
