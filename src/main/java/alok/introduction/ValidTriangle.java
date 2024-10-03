package alok.introduction;

import java.util.Scanner;

public class ValidTriangle {

    public static boolean isValidTriangle(double side1,double side2,double side3){
        if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double side3 = in.nextDouble();

        System.out.println(isValidTriangle(side1,side2,side3));
    }
}
