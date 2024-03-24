package javatpointObClass;

public class TestStudent2 
{
 public static void main(String[] args) {
	Student s1=new Student();
	Student s2=new Student();
	s1.insertRecord(100, "siva");
	s2.insertRecord(102,"rushi");
	s1.displayInformation();
	s2.displayInformation();
}
}
