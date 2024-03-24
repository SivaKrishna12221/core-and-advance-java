package pack2;
import java.io.FileReader;

public class ClassExceptionD 
{
 int available_amount=10000;
 void meth1(int withdraw_amount)
 {
	 int balance=available_amount-withdraw_amount;
	 if (available_amount<withdraw_amount)
	 {
		 throw new RuntimeException("Insufficient funds");
	 }
	 else
	 {
		 System.out.println("Transaction successfully");
	 }
	 System.out.println("remaining balance "+balance);
 }
 void meth2()throws Exception
 {
	 System.out.println("meth2() called");
	 FileReader fr=new FileReader("C:\\java\\java files.txt");
 }
 public static void main(String[] args)
 {
	 System.out.println("Banking");
	 ClassExceptionD aobj=new ClassExceptionD();
	  aobj.meth1(5000);
	  //aobj.meth2();
	 
}

}
