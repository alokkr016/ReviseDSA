package alok.maths;

import java.math.BigInteger;

public class Power {
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }

        return a * power(a, n - 1);
    }

//    public static int calculate (int n){
//
//    }

    public static int powerOptimised(int a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            int pow = n / 2;
            int val = 2;
            while (pow > 0) {
                if(pow % 2 == 0) {
                    val *= val;
                    pow = pow / 2;
                }else{
                    val = val * val * a;
                    pow = pow / 2;
                }
            }
            return val;
        } else {
            int pow = n / 2;
            int val = 2;
            while (pow > 0) {
                if(pow % 2 == 0) {
                    val *= val;
                    pow = pow / 2;
                }else{
                    val = val * val * a;
                    pow = pow / 2;
                }
            }

            return a * val;
        }
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        System.out.println(powerOptimised(a, b));
        System.out.println(Math.pow(a,b));
//        System.out.println(power(a,b));
//        BigInteger bigInteger = new BigInteger("2");
//        BigInteger bigInteger1 = new BigInteger("100000");
//        System.out.println(bigInteger.pow(1000000));
    }
}
