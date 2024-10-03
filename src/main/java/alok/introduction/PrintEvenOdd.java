package alok.introduction;

import java.util.Scanner;

public class PrintEvenOdd {

    public static void printEven(int n) {
        if (n == 2) {
            System.out.print(n + " ");
            return;
        }
        printEven(n - 1);
        if (n % 2 == 0) {
            System.out.print(n + " ");
        }
    }

    public static void printOdd(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printEven(n);
        System.out.println();
        printOdd(n);
    }
}
