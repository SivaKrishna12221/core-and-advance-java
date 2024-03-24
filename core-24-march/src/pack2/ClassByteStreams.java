package pack2;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassByteStreams
{
	void  fileOperations1()throws Exception
	{
		System.out.println("Reading the data from a file");
		FileInputStream fis=new FileInputStream("C:\\java\\corejava\\file1.txt");
		System.out.println("connection created");
	    int i;
	    while ((i=fis.read())!=-1)
	    {
	    	System.out.print((char)i);
	    }
	    System.out.println();
	    System.out.println("data Retrived");
	    
	    fis.close();
	}
	void fileOperations2()throws Exception
	{
	   System.out.println("writing the data into a file");
       FileOutputStream fos=new FileOutputStream("C:\\java\\corejava\\file2.txt",true);
       System.out.println("connection created to folder");
       String data=",Because it is awesome";
       byte arr[]=data.getBytes();
       fos.write(arr);
       System.out.println("data copied");
       fos.close();
       
       
	}
	void fileOperations3()throws Exception
	{
		System.out.println("copying the data from one file into another file");
		FileInputStream fis=new FileInputStream("C:\\java\\corejava\\file2.txt");
	    FileOutputStream fos=new FileOutputStream("C:\\java\\corejava\\file3.txt");
	    System.out.println("connection Created");
	    int x;
	    while((x=fis.read())!=-1)
	    {
	    	fos.write(x);
	    }
	    System.out.println("successfully copying");
	}
	public static void main(String[] args) throws Exception
	{
	  ClassByteStreams aobj=new ClassByteStreams();
	  //aobj.fileOperations1();
	 // aobj.fileOperations2();
	  aobj.fileOperations3();
	  
	}

}
