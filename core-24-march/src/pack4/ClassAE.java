package pack4;

public class ClassAE
{
	private String StudentName;
	private int StudentId;
	private String StudentDept;
	
	public String getStudentName() 
	{
		return StudentName;//siva
		
	}
	public void setStudentName(String studentName) 
	{
		System.out.println("step 1");
		 this.StudentName = studentName;//siva
		 
	}
	public int getStudentId() 
	{
		return StudentId;
	}
	public void setStudentId(int studentId) 
	{
		System.out.println("step 2");
		StudentId = studentId;
	}
	public String getStudentDept() 
	{
		return StudentDept;
	}
	public void setStudentDept(String studentDept) 
	{
		StudentDept = studentDept;
	}
 
}
