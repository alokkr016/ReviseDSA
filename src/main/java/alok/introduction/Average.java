package alok.introduction;

import java.util.Scanner;

public class Average {
    public static double averageOfThreeNumber(int a,int b,int c){
        double average = (a + b  + c) / 3.0;
        return average;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(averageOfThreeNumber(a,b,c));
    }
}
