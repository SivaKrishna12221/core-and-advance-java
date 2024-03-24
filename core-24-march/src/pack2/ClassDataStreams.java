package pack2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * Data Streams are used to transferred the primitive datatypes into securred manner..
 * Data Streams are also known as filter Streams
 */

public class ClassDataStreams 
{
  void fileOperations1()throws Exception
  {
	  System.out.println("Implementing the DataStreams to transferred the primitive"
	  		+ "primitive data type into securred manner");
	 DataOutputStream dos= new DataOutputStream(new FileOutputStream("c:\\java\\corejava\\file11.txt"));
	 System.out.println("Connection Created");
	 dos.writeInt(100);
	 dos.writeChar('A');
	 dos.writeBoolean(true);
	 dos.writeByte(234);
	 dos.writeInt(232);
	 System.out.println("Data entered");
	 dos.close();
	 System.out.println("============================");
	 DataInputStream dis= new DataInputStream(new FileInputStream("c:\\java\\corejava\\file11.txt"));
	 System.out.println("connection created to compiler");
	 System.out.println( dis.readInt());
	 
	 System.out.println(dis.readBoolean());
	 System.out.println(dis.readChar());
	 
	 System.out.println(dis.readInt());
	 System.out.println(dis.readByte());
	 
	 System.out.println("DataRetrived");
	 dis.close();
	 
	  
  }
  public static void main(String[] args) throws Exception
  {
          ClassDataStreams aobj= new ClassDataStreams();
          aobj.fileOperations1();
          
}
  /*
   * In data Streams we need to maintain an order of  storing and retriving the 
   * data
   */
  
}



