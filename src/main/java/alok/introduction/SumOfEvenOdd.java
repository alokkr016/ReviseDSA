package alok.introduction;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("sum of even " + sumOfEven(n));
        System.out.println("sum of odd " + sumOfOdd(n));
    }

    private static int sumOfOdd(int n) {
        if (n == 0) {
            return n;
        }

        if (n % 2 != 0) {
            return n + sumOfOdd(n - 1);
        } else {
            return sumOfOdd(n - 1);
        }
    }

    private static int sumOfEven(int n) {
        if (n == 0) {
            return n;
        }

        if (n % 2 == 0) {
            return n + sumOfEven(n - 1);
        } else {
            return sumOfEven(n - 1);
        }
    }
}
