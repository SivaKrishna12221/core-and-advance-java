package pack4;
import java.util.Scanner;

public class ClassBE 
{
	void display() 
	{
	  Scanner sc=new Scanner(System.in);//creating scanner
	    ClassAE aeobj= new ClassAE();
	  System.out.println("Please enter your name");
	  //aeobj.studentName=sc.next();
	  aeobj.setStudentName(sc.next());//siva
	  System.out.println("Please enter your Id");
	  //aeobj.studentId=sc.nextInt();
	  aeobj.setStudentId(sc.nextInt());//12221
	  System.out.println("Please enter your dept");
	  //aeobj.studentDept=sc.next();
	  aeobj.setStudentDept(sc.next());//bsc
	  sc.close();
	  
	  System.out.println("StudentName:"+aeobj.getStudentName());
	  System.out.println("StudentId:"+aeobj.getStudentId());
	  System.out.println("StudentDept:"+aeobj.getStudentDept());
     }
	public static void main(String[] args) 
	{
		new ClassBE().display();
	}
}