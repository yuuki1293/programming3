import java.util.*;

public class Prob04_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("数値:");
        int num = sc.nextInt();
        if (num % 5 == 0) {
        	System.out.println(num + ":5の倍数");
        } else {
        	System.out.println(num + ":5の倍数でない");
        }
    }
}