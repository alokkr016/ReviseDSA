package aman.a_flowchart;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int n){
        int p = 1;
        for(int i = 1; i<=n; i++){
            p = p * i;
        }

        return p ;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println(factorial(num));
    }
}
