package javatpointMultithreding;

public class JavaRunTimeClass 
{
public static void main(String[] args)throws Exception {
//Runtime.getRuntime().exec("shutdown -s -t 0");
 Runtime r=Runtime.getRuntime();
 System.out.println(r.availableProcessors());//8
 System.out.println(r.freeMemory());
 System.out.println(r.totalMemory());
 r.exec("notepad");
}
}
