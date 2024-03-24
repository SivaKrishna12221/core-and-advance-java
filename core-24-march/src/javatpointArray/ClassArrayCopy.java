package javatpointArray;

class ClassArrayCopy 
{
 public static void main(String[] args) 
 {
   char []copyfrom= {'a','b','c','d','c'};
   char []copyto=new char[5];
   System.arraycopy(copyfrom,0,copyto,1,4);
   System.out.println(String.valueOf(copyto));
}
}
