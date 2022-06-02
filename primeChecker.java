import java.util.Scanner;
// Write a program to check whether a number is prime or not

public class Main {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), p = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                p = 1;
                break;
            }
        }
        if (p == 0) {
            System.out.println("The entered number " + n + " is a Prime number");
        } else {
            System.out.println("The entered number " + n + " is a Not Prime number");
        }
    }
}