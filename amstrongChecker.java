import java.util.Scanner;
import java.lang.Math;
// Write a program to check whether a number is Armstrong or n
// 153 = 1*1*1 + 5*5*5 + 3*3*3

public class Main {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = 0, sum = 0, n1 = n;
        while (n != 0) {
            d++;
            n /= 10;
        }
        n = n1;
        while (n1 != 0) {
            sum += Math.pow(n1 % 10, d);
            n1 /= 10;
        }
        if (sum == n)
            System.out.println("The entered number " + n + " is Armstrong number");
        else
            System.out.println("The entered number " + n + " is Not Armstrong number");

    }
}
