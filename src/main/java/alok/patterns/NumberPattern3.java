package alok.patterns;

import java.util.Scanner;

public class NumberPattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}
