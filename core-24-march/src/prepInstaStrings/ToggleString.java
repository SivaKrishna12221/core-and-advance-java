package prepInstaStrings;

public class ToggleString//siVaKriSHNa=SIvAkRIshnA 
{
  public static void main(String[] args)
  {
	String s= "SiVaKriShNa";//by using literals here we are creating a string
	int len=s.length();
	String s2="";
	for(int i=0;i<len;i++)
	{
		if(Character.isUpperCase(s.charAt(i)))//character is uppercase particular index position chanage to lowercase
		{
			s2=s2+Character.toLowerCase(s.charAt(i));
		}
		else
		{
			s2=s2+Character.toUpperCase(s.charAt(i));
		}
	}
	System.out.println("toggle String is:"+s2);
}
}
//toggle String is:sIvAkRIsHnA

