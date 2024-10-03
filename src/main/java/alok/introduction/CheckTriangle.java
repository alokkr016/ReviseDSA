package alok.introduction;

import java.util.Scanner;

public class CheckTriangle {

    public static void checkTypeOfTriangle(double side1, double side2, double side3) {
        if (side1 == side2 && side2 == side3) {
            System.out.println("equilateral");
        } else if (side1 == side2 || side2 == side3) {
            System.out.println("isosceles");
        }else{
            System.out.println("scalene");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double side3 = in.nextDouble();
        checkTypeOfTriangle(side1,side2,side3);
    }
}
