package oct2023;

public class ClassIncrementDecrement {

   void meth1()
   {
	   int a=15;
	   System.out.println(a++);//15 a=16
	   a++;//a=17
	   System.out.println(a++);//17 a=18
	   System.out.println(++a);//19 a=19
	   System.out.println(a--);//19 a=18
	   System.out.println(--a);//17 a=17
	   a=a++;//now  a value=17 now it is not increment
	   System.out.println("a value:"+a);
	   System.out.println(++a);//
	   System.out.println(--a);//
	   a--; //17
	   System.out.println(--a);//
	   System.out.println(a--);//
	   System.out.println(a--);//
	   System.out.println(a);//15
	   
   }
   void meth2()
   {
	   int a=1;
	   int b=2;
	   int c;
	   int d;
	   c=++b;
	   d=a++;
	   c++;
	   System.out.println("a="+a);//2
	   System.out.println("b="+b);//3
	   System.out.println("c="+c);//4
	   System.out.println("d="+d);//1
   }
	public static void main(String[] args) {
		
		ClassIncrementDecrement varibles=new ClassIncrementDecrement();
		varibles.meth1();
		varibles.meth2();
	}
}
