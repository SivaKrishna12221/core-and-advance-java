package prepInsta;

public class QuadrantGraph 
/*
 * 1)if(x>0&& y>0)1st quadrant
 * 2)if(x<0&& y>0)2nd Quadrant
 * 3)if(x<0&& y<0)3rd quadrant
 * 4)if(x>0&& y<0)4th quadrant
 * 5)if(x=0&& y=0)origin
 * 6)if(x=!0&& y=0)x-axis
 * 7)if(x=0&& y!=0)y-axis
 */
{
  public static void main(String[] args) 
  {
	int x=-6;
	int y=-32;
	if(x>0&&y>0)
	{
		System.out.println("coordinates are in 1st quardinate");
	}
	if(x<0&&y>0)
	{
		System.out.println("coordinates are in 2st quardinate");
	}
	if(x<0&&y<0)
	{
		System.out.println("coordinates are in 3rd quardinate");
	}
	if(x>0&&y<0)
	{
		System.out.println("coordinates are in 4th quardinate");
	}
	if(x==0 && y==0)
	{
		System.out.println("coordinates are in origin");
	}
	if(x!=0 && y==0)
	{
		System.out.println("coordinates are in x-axis");
	}
	if(x==0 &&y!=0)
	{
		System.out.println("cordinates are in y-axis");
	}
}
}
