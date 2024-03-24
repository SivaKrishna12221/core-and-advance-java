package javatpointInter;

public interface InterfaceA 
{
	int i=10;
	static int a=10;
	final int b=20;
    void meth1();
   default  void meth4()
    {
    	System.out.println("interface meth4");
    }
    private void meth3()
    {
    	System.out.println("private methods meth3");
    }
    static void meth2()
    {
    	System.out.println("static methods");
    }
    public static void main(String[] args)
    {
		System.out.println("main methods");
	}
}
