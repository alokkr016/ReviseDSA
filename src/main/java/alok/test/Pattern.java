package alok.test;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            int value = (i);

            for (int j = 0; j < i; j++) {
                System.out.print(value--);
            }
            value++;
            for (int j = 0; j < i - 1; j++) {
                System.out.print(++value);
            }

            System.out.println();
        }
    }
}
