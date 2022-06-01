import java.util.Scanner;

// Write a program to print the correct grade according to a given percentage
// >50 <=60 C
// >60 <=70 B
// >70 <=80 A
// >80 <=90 E
// >90 <=100 O
// >100 Invalid Percentage
// <50 Fail

public class Main {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        char v = ' ';
        if (a1 > 50 && a1 <= 60) {
            v = 'C';
        }
        if (a1 > 60 && a1 <= 70) {
            v = 'B';
        }
        if (a1 > 70 && a1 <= 80) {
            v = 'A';
        }
        if (a1 > 80 && a1 <= 90) {
            v = 'E';
        }
        if (a1 > 90 && a1 <= 100) {
            v = 'O';
        }
        if (a1 < 50) {
            System.out.println("Fail");
        }
        if (a1 > 100) {
            System.out.println("Invalid Percentage");
        }
        if (v > 65) {
            System.out.println("Pass with grade: " + v);
        }
    }
}
