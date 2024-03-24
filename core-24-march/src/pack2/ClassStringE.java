package pack2;
/*
 * Given an "out" string length 4,such as "<<>>" and a word ,return a new string 
 * where the word is in the middle of the out string e.g "<<word>>;
 * makeOutWord("<<>>","Yoy")?"<<Yoy>>;
 */

public class ClassStringE 
{
	public String makeOutWord(String out,String word)
	{
		return out.substring(0,2)+word+out.substring(2);
	}
	public static void main(String[] args)
	{
		ClassStringE eobj=new ClassStringE();
		String result=eobj.makeOutWord("<<>>","java");
		System.out.println(result);
		
	}

}
