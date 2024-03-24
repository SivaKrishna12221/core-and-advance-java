package prepInsta;

public class PowerOfNumber 
{
	public static void main(String[] args) {
		
	double  base=2.5;
	double expo1=2.6;
	double expo2=-2.8;
	double res1,res2;
	
	res1=Math.pow(base,expo1);
	res2=Math.pow(base,expo2);
	
	System.out.println(base+"^"+expo1+"="+res1);
	System.out.println(base+"^"+expo2+"="+res2);
}
}