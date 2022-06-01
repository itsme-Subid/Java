import java.util.Scanner;

// Write a program to reverse a integer number

public class Main {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("The reverse of the entered number: " + reverse);
    }
}
