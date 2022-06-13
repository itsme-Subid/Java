import java.util.Scanner;

// 13.06.2022 for later realization

class Input {
    static Scanner sc = new Scanner(System.in);
}

public class Main extends Input {
    public static void main(String[] args) {
        // Write a Java program to print numbers between 1 to 100 which are divisible by
        // 3, 5 and by both.
        System.out.println("Print numbers between 1 to n which are divisible by 3, 5 and by both.");
        System.out.print("Enter n: ");
        int i = 1, n = sc.nextInt();
        System.out.println("Printing ...");
        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("Thank you!");
    }
}