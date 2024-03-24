package javatpoint;

public class Pyramid {
 
	public static void main(String[] args) {
		
		int l=10;
		int i, j,k;
		for(i=0;i<l;i++)
		{
			for(j=l-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
