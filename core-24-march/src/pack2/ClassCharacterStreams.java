package pack2;

import java.io.FileReader;
import java.io.FileWriter;

public class ClassCharacterStreams 
{
	void fileOperation1()throws Exception
	{
		System.out.println("Reading the data from the file by using character stream");
	     FileReader fr=new FileReader("C:\\java\\corejava\\file7.txt");
	     System.out.println("Connection Created");
	    int i;
	    while((i=fr.read())!=-1)
	    {
	    	System.out.print((char)i);
	    }
	    System.out.println("Data Retrived");
	    fr.close();
	}
	void fileOperation2()throws Exception
	{
		System.out.println("writing the data into a file by using character Stream");
		FileWriter fw=new FileWriter("C:\\java\\corejava\\file8.txt");
		System.out.println("connection created");
		String data="demo for writing data into a file by using character stream";
		fw.write(data);
		System.out.println("succesfully completed the data writing");
		fw.close();
		
	}
	void fileOperation3()throws Exception
	{
		System.out.println("copying the data from one file into another file by using Character Streams");
		FileReader fr=new FileReader("C:\\java\\corejava\\file7.txt");
		FileWriter fw=new FileWriter("C:\\java\\corejava\\file8.txt");
		System.out.println("connection created");
		int i;
		while((i=fr.read())!=-1)
		{
			fw.write(i);
		}
		fr.close();
		fw.close();
	}
	public static void main(String[] args) throws Exception
	{
		ClassCharacterStreams aobj=new ClassCharacterStreams();
		aobj.fileOperation1();
		aobj.fileOperation2();
		aobj.fileOperation3();
	}

}
