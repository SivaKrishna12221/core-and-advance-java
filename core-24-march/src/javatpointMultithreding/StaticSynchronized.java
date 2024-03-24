package javatpointMultithreding;

public class StaticSynchronized 
{
 public static void main(String[] args) {
  ClassTable ct=new ClassTable();
 // MyThread1 th1=new MyThread1(ct);it show error because we did not create constructor here 
  MyThread1 th1=new MyThread1();
  MyThread2 th2=new MyThread2();
  MyThread3 th3=new MyThread3();
  MyThread4 th4=new MyThread4();
  th1.start();
	
	  th2.start();
	  
	  th3.start();
	  
	  th4.start();
	 
}/*
1
2
3
4
5
1000
2000
3000
4000
5000
100
200
300
400
500
10
20
30
40
50
*/
}
