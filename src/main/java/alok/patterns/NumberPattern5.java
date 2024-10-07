package alok.patterns;

import java.util.Scanner;

public class NumberPattern5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(n - i);
            }
            System.out.println();
        }
    }
}
