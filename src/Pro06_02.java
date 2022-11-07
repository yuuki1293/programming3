public class Pro06_02 {
	public static void main(String[] args) {
		int[] array = new int[5];
		for(int i = 0; i < array.length; i++) {
			array[i] = i * 2 + 1;
		}
		for(int i = array.length-1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
}