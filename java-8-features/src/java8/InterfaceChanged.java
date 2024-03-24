package java8;

 interface Vehicle
{
	public void start();
	public static  void clean(Number nu)
	{
		System.out.println("clean method of interface");
	}
}
class Car implements Vehicle
{
	@Override
	public void start() {
		System.out.println("car  class start method executed");
		
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
     public static  void clean(Integer i) {
    	// TODO Auto-generated method stub
    	System.out.println("car class override method");
    }
    
}
class Bus implements Vehicle
{
	@Override
	public void start() {
	System.out.println("Bus class start method executed");
		
	}
}
class Scooty implements Vehicle
{
	@Override
	public void start() {
	
		System.out.println("Scooty class start method is executed");
	}
}
public class InterfaceChanged {

public static void main(String[] args) {
	Scooty v=new Scooty();
	v.start();
	Car s=new Car();
   s.clean(10);
}
}
