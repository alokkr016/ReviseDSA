package alok.introduction;

import java.util.Scanner;

public class GcdAndLcm {
    public static int gcd(int a, int b) {
        if (b % a == 0) {
            return a;
        }
        return gcd(b % a, a);
    }

    public static int gcdUsingLoop(int a, int b) {
        int remainder = 0;
        while (b > 0) {
            remainder = b % a;
            if (remainder == 0) {
                break;
            }
            b = a;
            a = remainder;
        }

        return a;
    }

    public static int gcdUsingWorstCase(int a, int b) {
        int gcd = 1;
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    public static int gcdOfMoreThan(int... arr) {
        int gcd = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            gcd = gcd(arr[0], arr[i]);
        }

        return gcd;
    }

    public static int lcmWorstCase(int a,int b){
        int k = 1;
        int lcm = Integer.MIN_VALUE;
        for (int i = Math.max(a,b); i <= (a * b); ) {
            if(i % a == 0 && i % b == 0){
                lcm = i;
                break;
            }
            i = i * k++;
        }

        return lcm;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(gcd(a, b));
        System.out.println(gcdUsingLoop(a, b));
        System.out.println(gcdUsingWorstCase(a, b));
        System.out.println(gcdOfMoreThan(new int[]{108, 112, 110}));
        System.out.println(lcmWorstCase(a,b));
    }
}
