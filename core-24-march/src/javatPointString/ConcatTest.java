package javatPointString;

public class ConcatTest {
public static void main(String[] args) {
  long startTime=System.currentTimeMillis();
  StringBuffer sb1=new StringBuffer("java");
  for(int i=0;i<=1000;i++)
  {
	  sb1.append("Tpoint");
  }
  System.out.println("time taken by StringBuffer:"+(System.currentTimeMillis()-startTime)+"ms");
  StringBuilder sb2=new StringBuilder("java");
  for(int i=0;i<=1000;i++)
  {
	  sb2.append("tpoint");
  }
  System.out.println("time taken by string buffer"+(System.currentTimeMillis()-startTime)+"ms");
}
}
