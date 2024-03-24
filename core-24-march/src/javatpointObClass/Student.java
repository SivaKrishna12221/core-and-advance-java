package javatpointObClass;

public class Student
{
 //initializing trough referrences
	int rollno;
	String name;
	void insertRecord(int id,String n)
	{
		rollno=id;
		name=n;
	}
	void displayInformation()
	{
		System.out.println(rollno+" "+name);
	}
}
