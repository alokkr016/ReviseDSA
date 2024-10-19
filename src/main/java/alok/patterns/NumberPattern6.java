package alok.patterns;

import java.util.Scanner;

public class NumberPattern6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            int value = 0;
            for (int j = 0; j < i; j++) {
                value = (i + j);
                System.out.print(value);
            }

            for (int k = 0; k < i - 1; k++) {
                System.out.print(--value);
            }

            System.out.println();
        }
    }
}
