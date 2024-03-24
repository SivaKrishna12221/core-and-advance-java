package pack2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassBufferedByteStream
{
	void fileOperation()throws Exception
	{
		System.out.println("implementing buffered byte streams");
	    BufferedInputStream bis	=new BufferedInputStream(new FileInputStream("C:\\java\\corejava\\file1.txt"));
	    System.out.println("connection created");
	    int i;
	    while((i=bis.read())!=-1)
	    {
	    	System.out.print((char)i);
	    }
	    System.out.println();
	    System.out.println("data retrieved");
	    bis.close();
	}
	void fileOperation2()throws Exception
	{
		System.out.println("Copying the data from one file into another file"
				+ "by using Buffered byte streams");
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\SIVA VELPULA\\OneDrive\\Pictures\\vivekananda 1.jpg"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream ("C:\\Users\\SIVA VELPULA\\OneDrive\\Pictures\\vivekananda copy1.jpg"));
		System.out.println("connection created");
		int i;
		while((i=bis.read())!=-1)
		{
			bos.write(i);
		}
		System.out.println("data copied");
		bis.close();
		bos.close();
		
	}
	public static void main(String[] args)throws Exception
	{
	  ClassBufferedByteStream obj =new ClassBufferedByteStream();
	  obj.fileOperation();
	  System.out.println("===================");
	  obj.fileOperation2();
	}
	


}
