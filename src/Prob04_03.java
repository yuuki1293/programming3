import java.util.*;

public class Prob04_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("時刻:");
        int num = sc.nextInt();
        if (0 <= num && num < 12) {
        	System.out.println("午前" + num + "時");
        } else if (12 <= num && num < 24){
        	System.out.println("午後" + (num - 12) + "時");
        } else {
        	System.out.println("エラー");
        }
    }
}