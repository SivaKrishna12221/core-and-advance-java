package abc;

public class SolverMindA {
	public test t ;
	int i = 1;
	static int j =2;
	int k;

	static {
		System.out.println(j);
		// System.out.println(new SolverMindA().i);
	}
	{
		System.out.println(j);
		System.out.println(i);
	}
	
	public void meth1()
	{
		System.out.println(i);
		System.out.println(k);
	}

	public static void main(String[] args) {
        System.out.println(j);
        SolverMindA aobj=new SolverMindA();
        System.out.println(aobj);
        aobj.meth1();
        System.out.println(aobj.t);
       
        
	}
}
