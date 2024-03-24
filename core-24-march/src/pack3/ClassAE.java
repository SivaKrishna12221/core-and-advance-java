package pack3;

public class ClassAE 
{
  private int EmployeeId;
  private String EmployeeName;
  private String EmployeeJob;
  private int ManagerId;
  private int Sal;
  private int Deptno;
public int getEmployeeId() 
{
	return EmployeeId;
}
public void setEmployeeId(int employeeId)
{
	System.out.println("step 1");
	this.EmployeeId = employeeId;
}
public String getEmployeeName() 
{
	
	return EmployeeName;
}
public void setEmployeeName(String employeeName)
{  
	System.out.println("step 2");
	this.EmployeeName = employeeName;
}
public String getEmployeeJob() 
{
	return EmployeeJob;
}
public void setEmployeeJob(String employeeJob) 
{
	System.out.println("step 3");
	this.EmployeeJob = employeeJob;
}
public int getManagerId() 
{
	return ManagerId;
}
public void setManagerId(int managerId) 
{
	System.out.println("step 4");
	this.ManagerId = managerId;
}
public int getSal() 
{
	return Sal;
}
public void setSal(int sal) 
{
	System.out.println("step 5");
	this.Sal = sal;
}
public int getDeptno() 
{
	return Deptno;
}
public void setDeptno(int deptno) 
{
	System.out.println("step 6");
	this.Deptno = deptno;
}
  
  
}
