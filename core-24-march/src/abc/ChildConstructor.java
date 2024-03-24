package abc;

public class ChildConstructor extends ChainingConstructor 
{
 String district;
 public ChildConstructor(String district,String name,String village)
 {
	 super(name,village);
	 this.district=district;
 }
 public void display()
 {
	 System.out.println(district+" "+name+ " "+village);
 }
 public static void main(String[] args) {
	ChildConstructor cc=new ChildConstructor("kadapa","siva","village");
	cc.display();
}
}
