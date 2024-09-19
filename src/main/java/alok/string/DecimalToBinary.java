package alok.string;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(decimalToBinary(n));
        System.out.println(decimalToBinary2(n));
    }

    public static int decimalToBinary(int decimalNumber) {
        int binaryNumber  = 0;
        int base = 1;

        while (decimalNumber > 0){
            int remainder = decimalNumber % 2;
            binaryNumber += remainder * base;
            decimalNumber /= 2;
            base *= 10;
        }
        return binaryNumber;
    }

    public static String decimalToBinary2(int n) {

        Stack<Integer> stack = new Stack<>();

        while (n > 0){
            stack.push(n % 2);
            n = n/2;
        }

        String result = "";
        while (!stack.isEmpty()){
            result += stack.pop();
        }

        return result;
    }
}
