package abc;

public class ChainingConstructor
{
 String name;
 String village;
 public ChainingConstructor(String name,String village)
 {
	 this.name=name;
	 this.village=village;
	 
 }
 public String toString()
 {
	 return "name:"+name+"village"+village;
 }
}
