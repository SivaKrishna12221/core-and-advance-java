package pack1;

public class ClassCloneB implements Cloneable
{
  int x=100;
  int y=200;
  ClassCloneB show()throws CloneNotSupportedException//here ClassB return type
  {
	  ClassCloneB obj=(ClassCloneB)super.clone();
	  return obj;
  }
}
