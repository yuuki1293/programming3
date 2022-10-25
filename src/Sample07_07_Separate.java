public class Sample07_07_Separate {
	static void separate() {
		separate("-");
	}
	
	static void separate(String s) {
		separate(s,30);
	}
	
	static void separate(String s, int x) {
		for(int i=0;i<x;i++) {
			System.out.print(s);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		double result1=2*3.14*7;
		System.out.println(result1);
		separate();
		int result2 = 3*4;
		System.out.println(result2);
		separate("*");
		double result3=7*5/2.0;
		System.out.println(result3);
		separate("=",5);
	}
}