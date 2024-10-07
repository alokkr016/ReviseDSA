package alok.test;

import java.util.Scanner;

public class NumberStars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(j);
            }
            for (int j = 0; j < (i - 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (i - 1); j++) {
                System.out.print("*");
            }
            for (int j = (n - i + 1); j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
