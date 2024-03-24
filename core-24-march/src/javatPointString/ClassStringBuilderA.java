package javatPointString;

public class ClassStringBuilderA {
public static void main(String[] args) {
	StringBuilder sb1=new StringBuilder();
	System.out.println(sb1.capacity());
	sb1.append("java is my favourite language");
	sb1.ensureCapacity(10);//now no Change
	System.out.println(sb1.capacity());
	sb1.ensureCapacity(50);//now(34*2)+2
	System.out.println(sb1.capacity());//now 70
	/*
	 * the ensureCapacity() method of StringBuilder class ensures
	 * that the given capacity is the minimum to the current capacity.if
	 * it is greater than the current capacity the increases its capacity value
	 */
}
}
