package abc;

public class ClassAc {
	int a = 5;
	int b = a++ + ++a + a-- - --a;
	{
	System.out.println(b);
	}
	public static void main(String[] args) {
	new ClassAc();
	}

}
