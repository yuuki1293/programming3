public class Sample07_05_Average {
	static double getAverage(int x, int y) {
		return (x+y)/2.0;
	}
	
	static void printOKNG(double x) {
		if(x>=6) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
	}
	
	public static void main(String[] args) {
		double scoreA=getAverage(3,9);
		System.out.print("Aさん "+scoreA+"点 ");
		printOKNG(scoreA);
		double scoreB = getAverage(5,4);
		System.out.print("Bさん "+scoreB+"点 ");
		printOKNG(scoreB);
	}
}