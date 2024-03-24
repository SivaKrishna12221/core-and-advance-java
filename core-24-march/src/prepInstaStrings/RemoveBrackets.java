package prepInstaStrings;
//replace all method "[(){}]","",
public class RemoveBrackets 
{
 public static void main(String[] args) {


  String s="(a+b)=c";
  String result=s.replaceAll("[(){}]","");
  System.out.println(result);
}
}
