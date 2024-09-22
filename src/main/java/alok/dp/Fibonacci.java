package alok.dp;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibonacciMemoization(int n) {
        int arr[] = new int[n + 1];
        Arrays.fill(arr, -1);
        return fibonacciMemoization(arr, n);
    }

    public static int fibonacciDP(int n) {
        int arr[] = new int[n + 1];
        Arrays.fill(arr, -1);

        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            if(arr[i] == -1){
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }

        return arr[n];
    }

    public static int fibonacciWithoutArray(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        int temp = 0;
        for (int i = 1; i < n; i++) {
            c = a + b;
            temp = b;
            b = c;
            a = temp;
        }

        return c;
    }

    public static int fibonacciMemoization(int arr[], int n) {
        if (n <= 1) {
            arr[0] = 0;
            arr[1] = 1;
            return arr[n];
        }

        if (arr[n] == -1) {
            arr[n] = fibonacciMemoization(arr, n - 1) + fibonacciMemoization(arr, n - 2);

        } else {
            arr[n] = arr[n - 1] + arr[n - 2];
        }

        return arr[n];
    }

    public static void main(String[] args) {
        int n = 20;
        // 0 1 1 2 3 5 8
        System.out.println(fibonacciWithoutArray(n));
        System.out.println(fibonacciMemoization(n));
        System.out.println(fibonacciDP(n));
        System.out.println(fibonacci(n));
    }
}
