package alok.introduction;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static int factorialUsingLoop(int n){
        int factorial = 1;
        for (int i = 1; i <=n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int factorialUsingRecursion(int n) {
        if(n <= 1){
            return 1;
        }

        return n * factorialUsingRecursion(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("factorial using loop " +  factorialUsingLoop(n));
        System.out.println("factorial using loop " + factorialUsingRecursion(n));
    }
}
