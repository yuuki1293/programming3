public class Main {
	static void printEvenOdd(int num) {
		if(num%2==0)
			System.out.println(num+"は偶数");
		else
			System.out.println(num+"は奇数");
	}
	
	public static void main(String[] args) {
		printEvenOdd(3);
		printEvenOdd(4);
	}
}