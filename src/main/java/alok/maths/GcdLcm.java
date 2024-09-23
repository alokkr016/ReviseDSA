package alok.maths;

import java.util.Scanner;

public class GcdLcm {
    public static int gcd(int a, int b) {
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

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static int gcd(int... arr) {
        if (arr.length >= 2) {
            int gcd = gcd(arr[0], arr[1]);
            for (int i = 2; i < arr.length; i++) {
                if (gcd == 1){
                    return 1;
                }
                gcd = gcd(gcd,arr[i]);
            }
            return gcd;
        } else {
            if (arr.length == 1) {
                return arr[0];
            } else {
                return -1;
            }
        }
    }

    public static int lcm(int... arr) {
        if(arr.length >= 2){
            int lcm = lcm(arr[0],arr[1]);
            for (int i = 2; i < arr.length; i++) {
                lcm = lcm(lcm,arr[i]);
            }
            return lcm;
        }else{
            if(arr.length == 1){
                return arr[0];
            }else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(lcm(arr));
//        System.out.println("GCD " + gcd(a, b));
//        System.out.println("LCM " + lcm(a, b));

        System.out.println(lcmBruteForce(10,20));
        System.out.println(hcfBruteForce(10,20));

    }

    public static int lcmBruteForce(int a,int b){
        int multiple = a * b;
        for (int i = multiple - 1; i >= Math.max(a, b);i--) {
            if (i % a == 0 && i % b == 0){
                multiple = i;
            }
        }
        return multiple;
    }

    public static int hcfBruteForce(int a,int b){
      int hcf = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            if(a % i == 0 && b % i == 0){
                hcf = i;
            }
        }
        return hcf;
    }



}
