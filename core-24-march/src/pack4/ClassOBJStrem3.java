package pack4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClassOBJStrem3 
{
 public static void main(String[] args) 
 throws Exception
 {
	ClassOBJStream obj1=new ClassOBJStream();
	ClassOBJStream2 obj2=new ClassOBJStream2();
	System.out.println(obj1.a+" "+ obj1.b);
	System.out.println(obj2.x+" "+ obj2.y);
	ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("C:\\\\Users\\\\SIVA VELPULA\\\\OneDrive\\\\Documents\\\\java files\\\\object out streams.txt"));
	os.writeObject(obj1);
	os.writeObject(obj2);
	System.out.println("serilization completed");
	ObjectInputStream is=new ObjectInputStream(new FileInputStream("C:\\Users\\SIVA VELPULA\\OneDrive\\Documents\\java files\\object out streams.txt"));
	ClassOBJStream aobj3=(ClassOBJStream)is.readObject();
	ClassOBJStream2 aobj4=(ClassOBJStream2)is.readObject();
	System.out.println(aobj3.a+" "+aobj3.b);
	System.out.println(aobj4.x+" "+aobj4.y);
	os.close();
}

}
