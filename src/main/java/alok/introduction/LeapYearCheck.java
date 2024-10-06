package alok.introduction;

import java.util.Scanner;

public class LeapYearCheck {

    public static boolean isALeapYear(int year) {
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                isLeapYear = true;
            } else {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            }
        }

        return isLeapYear;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = 0;
        for (int i = 1900; i <=2024 ; i++) {
            if(isALeapYear(i)){
                k++;
                System.out.println("Year " + i);
            }
        }
        System.out.println("count " + k);

    }
}
