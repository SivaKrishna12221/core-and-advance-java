package javatpointArray;

public class ClassArrayM2 {
	public static void main(String[] args) {
		int arr[][] = new int[][] { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr.length - 1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		Class c = arr.getClass();
		System.out.println(c);
		String s = c.getName();
		System.out.println(s);
	}
}
