package aman.a_flowchart;

import java.util.Scanner;

public class Average {

    public static double averageOfThreeNumbers (int a, int b , int c) {
        double average = (a+b+c)/3.0;
        return average;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int Second  = input.nextInt();
        int third  = input.nextInt();

        double average = averageOfThreeNumbers(first, third, Second);
        System.out.println(average);
    }   
}
