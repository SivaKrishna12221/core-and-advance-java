package javatpointRP;

public class BankTest
{
 public static void main(String[] args) 
 {
	Bank b;
	b=new ICICI();
    float f=b.getRateOfIntrest();
	System.out.println("getRateOfIntrest:ICICI"+f);
}
}
