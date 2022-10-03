import java.util.*;

public class Sample04_02_If1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("点数:");
        int score = sc.nextInt();
        if (score >= 60) {
        	System.out.println("合格");
        }
    }
}