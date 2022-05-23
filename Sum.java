import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Write a program to add two integer numbers and display the result
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        int sum;
        sum = n1 + n2;
        System.out.println("The sum of entered two numbers are: " + sum);
    }
}