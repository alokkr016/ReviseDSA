package alok.conditions_and_loop;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        while (number > 0){
            int current = number % 10;
            if(current % 2 == 0){
                sumEven += current;
            }else{
                sumOdd += current;
            }
            number /= 10;
        }

        System.out.println(sumEven + " " + sumOdd);
    }
}
