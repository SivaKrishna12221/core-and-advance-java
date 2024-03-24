package pack3;

public class ThisKC
{
	public int meth1(int a,int b)//a=18,b=5
	{
		System.out.println("meth1 called");
		System.out.println(b);
		System.out.println(100);
		return(a+b)+10+(a-b);//23+10+13=46
	}
	public int meth2()//main() //18
	{
		System.out.println("meth2 called");
		return this.meth3()+8;//10+8=18;
	}
	public ThisKC()
	{
		this("Java is awesome");
		System.out.println(50);
	}
	int meth3()
	{
		System.out.println("meth3 called");
		return 10;
	}
	public String meth4(int a,String s)//45 ,java//calling main
	{
		System.out.println("meth4 called");
		a=a+4;
		System.out.println("a value==>"+a);
		System.out.println("s value==>"+s);
		return s+"is object oriented programming language";
		
	}
	public int meth5(int a)//a=5,
	{
		System.out.println("meth5() called");
		return 10-a;//
	}
	public ThisKC(String s) 
	{
		String result = this.meth4(this.meth1(this.meth2(),this.meth5(5)+'A'-('a')),"java");
		//meth2()=18, //meth3() =5,java//meth1()=46
		System.out.println(result);
		System.out.println(s);
		
	}
	public static void main (String[] args) 
	{
		new ThisKC();
	}
	

}
