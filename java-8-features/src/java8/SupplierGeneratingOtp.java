package java8;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierGeneratingOtp {

 
	public static void main(String[] args) {
		Supplier<String> s=()->
		{
		String otp="";
		for(int i=0;i<5;i++)
		{
		  int n= (int)(Math.random() *10);
		  otp=otp+n;
		}
		return otp;
		};
		System.out.println(s.get());
	}
}
