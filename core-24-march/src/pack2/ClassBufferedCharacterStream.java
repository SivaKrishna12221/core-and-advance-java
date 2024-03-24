package pack2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ClassBufferedCharacterStream
{
  void fileOperation1()throws Exception
  {
	  System.out.println("copying the data from one file into another file");
	  BufferedReader br=new BufferedReader(new FileReader("C:\\java\\corejava\\file3.txt"));
	  BufferedWriter bw  =new BufferedWriter(new FileWriter("C:\\java\\corejava\\file10.txt"));
	  System.out.println("connection created");
	  int i;
	  while((i=br.read())!=-1)
	  {
		  bw.write(i);
	  }
	  System.out.println("data copied");
	  br.close();
	  bw.close();
  }
  public static void main(String[] args)throws Exception
  {
	 ClassBufferedCharacterStream obj=new ClassBufferedCharacterStream();
	 obj.fileOperation1();
	
}
}
