package alok.introduction;

import java.util.Scanner;

public class CheckTriangle {

    public static void checkTypeOfTriangle(double side1, double side2, double side3) {
        if (!ValidTriangle.isValidTriangle(side1, side2, side3)) {
            System.out.println("The triangle is not valid");
            return;
        }

        if (side1 == side2 && side2 == side3) {
            System.out.println("equilateral");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }

    public static double findMax(double a, double b, double c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void checkTriangleType(double side1, double side2, double side3) {
        if (!ValidTriangle.isValidTriangle(side1, side2, side3)) {
            System.out.println("The triangle is not valid");
            return;
        }

        double maxSide = findMax(side1, side2, side3);

        if (maxSide == side1) {
            checkTriangle(side1, side2, side3);
        } else if (maxSide == side2) {
            checkTriangle(side2, side1, side3);
        } else {
            checkTriangle(side3, side3, side1);
        }
    }

    public static void checkTriangle(double maxSide, double otherSide1, double otherMaxSide2) {
        if (maxSide * maxSide == (otherSide1 * otherSide1) + (otherMaxSide2 * otherMaxSide2)) {
            System.out.println("Right angle triangle");
        } else if ((maxSide * maxSide) > (otherSide1 * otherSide1) + (otherMaxSide2 * otherMaxSide2)) {
            System.out.println("Obtuse angle triangle");
        } else {
            System.out.println("acute angle triangle");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double side3 = in.nextDouble();
        checkTriangleType(side1,side2,side3);
        checkTypeOfTriangle(side1, side2, side3);
    }
}
