import java.util.Scanner;

// Write a program to print the largest number among three integer numbers

public class Main {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), a2 = sc.nextInt(), a3 = sc.nextInt(), max = a1;
        if (a2 > max) {
            max = a2;
        }
        if (a3 > max) {
            max = a3;
        }
        System.out.println("Largest number is " + max);
    }
}