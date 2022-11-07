public class Prob07_3 {
	static int getDiff(int a, int b) {
		return Math.abs(a-b);
	}
	
	public static void main(String[] args) {
		System.out.println("9と3の差は" + getDiff(9,3));
		System.out.println("4と5の差は" + getDiff(4,5));
	}
}