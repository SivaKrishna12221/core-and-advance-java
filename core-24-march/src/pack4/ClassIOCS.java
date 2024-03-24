package pack4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClassIOCS 
{
  public void fileOperation1()throws IOException
  {
	 System.out.println("Reading the data from the file");
	 FileReader fr=new FileReader("C:\\Users\\SIVA VELPULA\\OneDrive\\Documents\\java files\\Project Title Student Result Management system.txt");
	 FileWriter fw=new  FileWriter("C:\\Users\\SIVA VELPULA\\OneDrive\\Documents\\java files\\Project Title Student Result Management system 2.txt");
	 int i;
	 while((i=fr.read())!=-1)
	 {
		fw.write(i);
	 }
	 System.out.println("read successfully");
	 
  }
  public static void main(String[] args) throws Exception{
	ClassIOCS cs=new ClassIOCS();
	cs.fileOperation1();
}
}
