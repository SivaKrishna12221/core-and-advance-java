package jdbc1;

import oracle.net.jndi.JndiAttrs;

public class JavaBean2 
{
 public static void main(String[] args) {
	JavaBean jb=new JavaBean();
	jb.setHeight(789);
	System.out.println(jb.getHeight());
}
}
