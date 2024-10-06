package alok.conditions_and_loop;

import java.util.Scanner;

/*
input - 5
    1
   23
  345
 4567
56789
 */
public class Pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j + i);
            }
            System.out.println();
        }
    }
}
