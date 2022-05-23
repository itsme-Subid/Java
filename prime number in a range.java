package com.company;

import java.util.Scanner;

public class Main {

    static int primeChecker(int n) {
        int a = 0;
        if (n == 0 || n == 1) {
            a = 1;
        }
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                a = 1;
                break;
            }
        }
        if (a == 0) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The enter number 1:");
        int n1 = sc.nextInt();
        System.out.println("The enter number 2:");
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            if (primeChecker(i) == 1) {
                System.out.println(i + "\t");
            }
        }
    }
}