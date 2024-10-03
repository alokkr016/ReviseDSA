package alok.introduction;

import java.util.Scanner;

public class IdentifyTheIntegerType {
    public static String tellTheIntegerType(int n) {
        if (n < 0) {
            return n + " is a negative number";
        } else if (n > 0) {
            return n + " is a positive number";
        }else{
            return n + " is a zero";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(tellTheIntegerType(number));
    }
}
