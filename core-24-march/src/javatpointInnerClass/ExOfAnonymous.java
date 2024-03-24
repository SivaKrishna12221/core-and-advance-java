package javatpointInnerClass;

public abstract class ExOfAnonymous 
{
  public abstract void print();
 
  public static void main(String[] args) {
	ExOfAnonymous ex=new ExOfAnonymous()
			{
		public void print()
		{
			System.out.println("print");
		}
			};
			ex.print();
}
}
