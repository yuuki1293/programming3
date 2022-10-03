import java.util.*;

public class Prob05_03 {
    public static void main(String[] args) {
        int num = 5;
        int input = -1;
        
        Scanner sc = new Scanner(System.in);
        while (num != input) {
        	System.out.print("数はいくつ？ ");
        	input = sc.nextInt();
        }
        System.out.println("あたり！");
    }
}