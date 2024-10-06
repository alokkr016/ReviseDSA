package alok.conditions_and_loop;

import java.util.Scanner;
/*
4
   *
  ***
 *****
*******
 */
public class Pattern3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
