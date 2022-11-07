public class ArrayGraph {
	public static void main(String[] args) {
		int[] data = {6,8,7,5,9};
		for(int i = 0; i< data.length; i++) {
			for(int x = 0; x < data[i];x++) {
				System.out.print("*");
			}
			System.out.println(" " + data[i]);
		}
	}
}