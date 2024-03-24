package prepInsta;

public class HexadecimalToDecimal //(83DF)^16==>16^3*8+16^2*3+16^1*14+16^0*16
          //"0123456789ABCDEF"
{
  public static void main(String[] args) 
  {
	String hex="c9";
	System.out.println(convert(hex));
  }
  static int convert(String hex)
  {
	 String digits="0123456789ABCDEF";
	 hex=hex.toUpperCase();
	 int value=0;
	 for(int i=0;i<hex.length();i++)
	 {
		 char c=hex.charAt(i);//0th index position "c";
		 int d=digits.indexOf(c);//check c position number;
		 value=16*value+d;//16*0+13==>13=>16*13+10=>
	 }
	 return value;
  }
}




