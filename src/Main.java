public class Main {
	static String getEvenOdd(int num) {
		if(num%2==0)
			return "偶数";
		else
			return "奇数";
	}
	
	public static void main(String[] args) {
		System.out.println("3は" + getEvenOdd(3));
		System.out.println("4は" + getEvenOdd(4));
	}
}