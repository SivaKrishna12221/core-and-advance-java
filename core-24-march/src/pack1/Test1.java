package pack1;

import java.util.Arrays;

public class Test1 
{
  public static void main(String[] args) {
	Class c1=Test1.class;
	System.out.println("c1 obj class name::"+c1.getClass());
	//c1 obj class name::class java.lang.Class
    System.out.println("c1 obj data::"+c1.toString());
    //c1 obj data::class pack1.Test1
   System.out.println("c1 obj name::"+c1.getName());
   //c1 obj name::pack1.Test1
    System.out.println("c1 obj data class super name::"+c1.getSuperclass());
    //c1 obj data class super name::class java.lang.Object
    System.out.println("c1 obj data class list of implemented inteface"+Arrays.toString(c1.getInterfaces()));
    //c1 obj data class list of implemented inteface[]
     System.out.println("c1 obj data class list of  methods:"+Arrays.toString(c1.getDeclaredMethods()));
     //c1 obj data class list of  methods:[public static void pack1.Test1.main(java.lang.String[])]
   Class c2=System.class;
   System.out.println("c2 obj class name:"+c1.getClass());
  // c2 obj class name:class java.lang.Class
     System.out.println("c2 obj data:;"+c2.toString());
     //c2 obj data:;class java.lang.System
    System.out.println("c2 obj data className()"+c2.getName());
    //c2 obj data className()java.lang.System
    System.out.println("c2 obj data class super Name"+c2.getSuperclass());
  //  c2 obj data class super Nameclass java.lang.Object
    System.out.println("c2 obj data class implemented classes"+Arrays.toString(c2.getInterfaces()));
    //c2 obj data class implemented classes[]
    System.out.println("c2 obj data class list of methods:"+Arrays.toString(c2.getMethods()));

}
}
