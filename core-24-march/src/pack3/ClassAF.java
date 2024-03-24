package pack3;
import java.util.Scanner;

public class ClassAF
{
  public void meth1()
  {
   Scanner	sc= new Scanner(System.in);
   ClassAE aeobj=new ClassAE();
   System.out.println("Please enter EmployeeId:");
   aeobj.setEmployeeId(sc.nextInt());
   System.out.println("Please enter EmployeeName:");
   aeobj.setEmployeeName(sc.next());
   System.out.println("Please enter EmployeeJob:");
   aeobj.setEmployeeJob(sc.next());
   System.out.println("Please enter ManagerId:");
   aeobj.setManagerId(sc.nextInt());
   System.out.println("Please enter deptno:");
   aeobj.setDeptno(sc.nextInt());
   
   System.out.println("======Employee details==========");
   System.out.println("EmployeeId    :"+aeobj.getEmployeeId());
   System.out.println("EmployeeName  :"+aeobj.getEmployeeName());
   System.out.println("EmployeeJob   :"+aeobj.getEmployeeJob());
   System.out.println("ManagerId     :"+aeobj.getManagerId());
   System.out.println("DetpNo        :"+aeobj.getDeptno());
  }
  public static void main(String[] args) 
  {
	System.out.println("Gleen Wood");
	System.out.println("==========");
	System.out.println("Product based company");
	System.out.println("------------------------");
	new ClassAF().meth1();
}
}
