package alok.conditions_and_loop;

import java.util.Scanner;

/*
1
23
345
 */
public class Pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + i);
            }
            System.out.println();
        }
    }
}
