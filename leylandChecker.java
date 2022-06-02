import java.util.Scanner;
import java.lang.Math;
// Write a program to check whether a number is Leyland or not

public class Main {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = 2, y = 2, bool = 0;
        outerloop: for (x = 2; x <= n; x++) {
            for (y = 2; y <= x; y++) {
                if ((Math.pow(x, y) + Math.pow(y, x)) == n) {
                    bool = 1;
                    break outerloop;
                }
            }
        }
        System.out.println(
                bool == 1 ? "The entered number is a leyland number" : "The entered number is not a leyland number");
    }
}