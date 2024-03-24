package pack4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassIODS 
{
 public void fileOperation1()throws Exception
 {
	 System.out.println("implementing data streams");
	 DataOutputStream dos=new DataOutputStream(new FileOutputStream("C:\\Users\\SIVA VELPULA\\OneDrive\\Documents\\java files\\data out streams.txt"));
	 dos.writeInt(120121);
	 dos.writeChar('c');
	 dos.writeBoolean(true);
	 dos.writeInt(43);
	 System.out.println("data transferred");
	 dos.close();
	 
	 DataInputStream dis=new DataInputStream(new FileInputStream("C:\\Users\\SIVA VELPULA\\OneDrive\\Documents\\java files\\data out streams.txt"));
	 System.out.println(dis.readInt());
	 System.out.println(dis.readChar());
	 System.out.println(dis.readBoolean());
 }
 public static void main(String[] args)throws Exception {
	ClassIODS cs=new ClassIODS();
	cs.fileOperation1();
}
}
