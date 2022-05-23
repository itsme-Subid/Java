import java.util.Scanner;

public class greaterNumber {
    public static void main(String[] args) {
        // Write a program to print the largest number among two integer numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.println("Both the entered numbers are equal");
        } else if (n1 < n2) {
            System.out.println(n2 + " is greater than " + n1);
        } else {
            System.out.println(n1 + " is greater than " + n2);
        }
    }
}