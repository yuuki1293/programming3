import java.util.*;

public class Prob03_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		double a = sc.nextDouble();
		System.out.print("b = ");
		double b = sc.nextDouble();
		System.out.print("c = ");
		double c = sc.nextDouble();
		
		double x1 = (-b + Math.sqrt(b * b - 4 * a * c))/(2 * a);
		double x2 = (-b - Math.sqrt(b * b - 4 * a * c))/(2 * a);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
	}
}