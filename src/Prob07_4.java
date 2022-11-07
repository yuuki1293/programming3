public class Prob07_4 {
	static int getSum(int[] num) {
		int sum=0;
		for(int i=0; i < num.length; i++)
			sum+=num[i];
		return sum;
	}
	
	public static void main(String[] args) {
		int[] num = {1,7,3,2};
		System.out.println("総和は" + getSum(num));
	}
}