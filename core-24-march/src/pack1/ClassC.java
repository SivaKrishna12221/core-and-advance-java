package pack1;
import java.io.*;

public class ClassC 
{
 void fileOperation1()throws Exception
 {
	 System.out.println("Implementing Object Streams");
	 System.out.println("Object Streams means are used to perform "
	 		+ "Serialization .Serialization means it is a process of"
	 		+ " writing the data into a file");
	 ClassCloneA aobj1=new ClassCloneA();
	 ClassCloneB bobj1=new ClassCloneB();
	 ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\SIVA VELPULA\\OneDrive\\Documents\\java files\\OUT5.txt"));
	 System.out.println("connection created");
	 System.out.println(aobj1.a+" "+aobj1.b);
	 System.out.println(bobj1.x+" "+bobj1.y);
	 oos.writeObject(aobj1);
	 oos.writeObject(bobj1);
	 System.out.println("Seriliazation completed");
	 ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\SIVA VELPULA\\\\OneDrive\\\\Documents\\\\java files\\\\OUT5.txt"));
	 System.out.println("connection created to inputStream");
	 ClassCloneA aobj2=(ClassCloneA)ois.readObject();
	 ClassCloneB bobj2=(ClassCloneB)ois.readObject();
	 System.out.println(aobj2.a+" "+aobj2.b);
	 System.out.println(bobj2.x+" "+bobj2.y);
	 
	 
	 oos.close();
	 ois.close();
 }
 public static void main(String[] args)throws Exception
 {
  ClassC cobj1=	new ClassC();
  cobj1.fileOperation1();
}
}
/*
Implementing Object Streams
Object Streams means are used to perform Serialization .Serialization means it is a process of writing the data into a file
connection created
10 20
100 200
Serialization completed
connection created to inputStream
0 20
0 200
*/