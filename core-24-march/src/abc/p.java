package abc;

public class p {
	public static void main(String[] args) {

		/*
		 * int binary = 365; int decimal = 0;// (0*2^0)+(1*2^1)(1*2^2)+(0*2^3) int
		 * num=0; int rem; int count = 0; while (binary != 0) { rem = binary % 10;
		 * decimal = decimal + rem * (int) Math.pow(8,count); binary=binary/10; count++;
		 * } System.out.println(decimal);
		 */
		//decimal to binary
		
		/*
		 * int octal=016; int decimal=0; int num=0; int rem; while(octal!=0) {
		 * rem=octal%10; decimal+=rem*Math.pow(8,num); octal=octal/10; num++; }
		 * System.out.println(decimal);
		 */
		//arr[1]=?
		/*
		 * int arr[]= {0,2,4,1,3}; for(int i = 0; i < arr.length; i++){ arr[i] =
		 * arr[(arr[i] + 3) % arr.length]; }
		 */
		//arr[0]=arr[0+3%5]=1;
		//arr[1]=arr[2+3%5]=arr[0]=1;
		 
		
		/*
		 * if(1+1+1+1+1==5) { System.out.println("true"); } else {
		 * System.out.println("false"); }
		 */	 
		/*
		 * int i; for(i=1;i<6;i++) { if(i>3) continue; } System.out.println(i);
		 */
	}
}
