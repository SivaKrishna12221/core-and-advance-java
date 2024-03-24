package pack2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClassObjectStreamC 
{
  public static void main(String[] args)throws Exception
  {
	 ClassObjectStreamA aobj1= new ClassObjectStreamA();
	 ClassObjectStreamB bobj1=new ClassObjectStreamB();
	 System.out.println(aobj1.a+" "+aobj1.b);
	 System.out.println(bobj1.x+" "+bobj1.y);
	 ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("c:\\java\\corejava\\file12.txt"));
	 System.out.println("connection created");
	 oos.writeObject(aobj1);
	 oos.writeObject(bobj1);
	 System.out.println("serialization completed");
	 oos.close();
	 System.out.println("===================");
	 System.out.println("Reading object class data present in the file");
	 ObjectInputStream ois=new ObjectInputStream(new FileInputStream("c:\\java\\corejava\\file12.txt"));
	 System.out.println("Connection created");
	 ClassObjectStreamA aobj2=(ClassObjectStreamA)ois.readObject();
	 ClassObjectStreamB bobj2=(ClassObjectStreamB)ois.readObject();
	 //here we are calling read method to with respective classobjects
	 System.out.println(aobj2.a+" "+aobj2.b);
	 System.out.println(bobj2.x+" "+bobj2.y);
	 System.out.println("Data retrieved");
	 ois.close();
}
}
