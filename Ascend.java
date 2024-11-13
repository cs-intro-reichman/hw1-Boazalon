// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lim = Integer.parseInt(args[0]);
		double num1 = Math.random()*lim;
		double num2 = Math.random()*lim;
		double num3 = Math.random()*lim;
		int a = (int) num1;
		int b = (int) num2;
		int c = (int) num3;

		System.out.println( (int)num1 + " " + (int)num2 + " " + (int)num3 + " ");

		int min = Math.min(Math.min(a, b), c);
		int max = Math.max(Math.max(a, b), c);
		int mid = a + b + c - max - min;

		System.out.println( min + " " + mid + " " + max);	}
}
