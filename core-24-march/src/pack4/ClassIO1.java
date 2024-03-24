package pack4;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassIO1 
{
	/*
	 * Byte streams:In Byte streams data will be transferred in the form
	 * of bytes.The length of each data packet is of 1 byte. 
	 */
	/*
	 * read():The return type of read () is int.It is going to return aschii values of the
	 * characters which are present in file .if there is no characters present in file the read() is going to
	 * return -1;
	 */
  public void fileOperation()throws Exception
  {
	  System.out.println("i am going to read data present in the file");
	  FileInputStream fis=new FileInputStream("C:\\Users\\SIVA VELPULA\\OneDrive\\Documents\\java files\\Project Title Student Result Management system.txt");
	  System.out.println("connection created successfully");
	  int i;//if data is present it contains ascii values otherwise it returns -1
	  while((i=fis.read())!=-1)
	  {
		  System.out.print((char)i);
	  }
	  System.out.println("read successfully");
	  fis.close();
  }
  public void fileOperation2()throws Exception
  {
	  System.out.println(" I am going write the data into file by using file output stream");
	 
	  FileOutputStream fos=new FileOutputStream("C:\\Users\\SIVA VELPULA\\OneDrive\\Documents\\java files\\Project Title Student Result Management system copy 2.txt");
	  
	  System.out.println("connection Created successfully");
	  
	  String data=", now i am going to add new profile data the my resume. I enthuastic and dedicated hard work";
	 
	  byte arr[]=data.getBytes();
	  
	  fos.write(arr);//implicit type casting
	  
	  System.out.println("data copied");
	  
  }
  public void fileOperation3()throws Exception
  {
	  System.out.println("now i am going to copy the data from one file to another file");
	  FileInputStream fis=new FileInputStream("C:\\Users\\SIVA VELPULA\\OneDrive\\Documents\\java files\\Project Title Student Result Management system.txt");
	  FileOutputStream fos=new FileOutputStream("C:\\Users\\SIVA VELPULA\\OneDrive\\Documents\\java files\\Project Title Student Result Management system copy2.txt");
	  int i;
	  while((i=fis.read())!=-1)
	  {
		  fos.write(i);
	  }
	  System.out.println("copied data successfully");
	fis.close();
	fos.close();
  }
  public static void main(String[] args)throws  Exception {
	ClassIO1 obj=new ClassIO1();
	//obj.fileOperation();
	//obj.fileOperation2();
	obj.fileOperation3();
}
}
