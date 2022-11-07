public class Pro06_02 {
	public static void main(String[] args) {
		int[] tests = {62,84,78,50,91};
		int m = tests[0];
		for(int i =0;i<tests.length;i++) {
			System.out.print(tests[i]+" ");
			if(m<tests[i])
				m=tests[i];
		}
		System.out.println();
		System.out.println("最大値：" + m);
	}
}