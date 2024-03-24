package pack2;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassByteStreamsA 
{
	void fileOperation1()throws Exception
	{
		System.out.println("Reading the data from the file");
	    FileInputStream fis=new FileInputStream("C:\\Users\\SIVA VELPULA\\OneDrive\\Pictures\\apj 1.jpeg");
	    System.out.println("Connection Created");
	    /*The return type of read() method is int.It is going to returns the ASCII values of
	     * characters which in the file  then read() method is going to return -1 .
	     */
	    
	    int i;
	    while((i=fis.read())!=-1)
	    {
	    	System.out.print((char)i);
	    }
	    System.out.println();
	    System.out.println("Data retrived");
	    fis.close();
	}
	void fileOperation2()throws Exception 
	{
		System.out.println("Writing the data into a file");
		FileOutputStream fos=new FileOutputStream("C:\\java\\corejava\\file5.txt",true);
		System.out.println("connection created to the file");
		String data=",i think our breakfast will be Punugulu";
		byte arr[]=data.getBytes();//here we creating an array for bytes to store values
		fos.write(arr);
		System.out.println("Whatever you write the data in the compiler it copying into a file4");
		fos.close();
	}
	void fileOperation3() throws Exception
	{
		System.out.println("Copying the data from one file into another file");
		FileInputStream fis=new FileInputStream("C:\\Users\\SIVA VELPULA\\OneDrive\\Pictures\\apj 1.jpeg");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\SIVA VELPULA\\OneDrive\\Pictures\\apj 2 copy.jpeg");
		System.out.println("connection created to existing data file to another file");
		int i;
		while((i=fis.read())!=-1)
		{
			fos.write(i);
		}
		System.out.println("Data copying");
		fis.close();
		fos.close();
	}
	public static void main(String[] args) throws Exception
	{
		ClassByteStreamsA aobj=new ClassByteStreamsA();
		aobj.fileOperation1();
		aobj.fileOperation2();
		aobj.fileOperation3();
	}

}
