package alok.conditions_and_loop;

import java.util.Scanner;

public class CalculatePower {
    public static int power(int x,int n){
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        System.out.println(power(x,n));
    }
}
