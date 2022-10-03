import java.util.*;

public class Prob05_01 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
        	System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 2; i <= 20; i += 2) {
        	System.out.print(i + ",");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
        	System.out.print("☆");
        }
        System.out.println();
    }
}