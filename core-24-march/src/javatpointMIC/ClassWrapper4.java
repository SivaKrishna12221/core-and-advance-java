package javatpointMIC;

public class ClassWrapper4 
{
  private int i;
  ClassWrapper4()
  {
	  
  }
  ClassWrapper4(int i)
  {
	  this.i=i;
  }
  public int getValue()
  {
	  return i;
	  
  }
  public void setValue(int i)
  {
	  this.i=i;
  }
  @Override
  public String toString()
  {
	  return Integer.toString(i);
  }
  public static void main(String[] args) {
	ClassWrapper4 cw=new ClassWrapper4(10);
	System.out.println(cw);
}
}
