public class Prob07_5 {
	static int getMax(int[] num) {
		int max=num[0];
		for(int i=1; i < num.length; i++)
			if(max < num[i])
				max = num[i];
		return max;
	}
	
	public static void main(String[] args) {
		int[] num = {1,7,3,2};
		System.out.println("最大値は" + getMax(num));
	}
}