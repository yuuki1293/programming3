public class ArrayGraph_1 {
	public static void main(String[] args) {
		String[] subjects = {"数","英","理","社","国"};
		int[] data = {6,8,7,5,9};
		for(int i = 0; i< data.length; i++) {
			System.out.print(subjects[i]);
			for(int x = 0; x < data[i];x++) {
				System.out.print("*");
			}
			System.out.println(" " + data[i]);
		}
	}
}