import java.util.Scanner;

// Write a program to add the digits of a given integer number

public class Main {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = 0, sum = 0;
        while (n > 0) {
            d = n % 10;
            n = n / 10;
            sum = sum + d;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}