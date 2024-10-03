package sachin.coding_ninja_in_order;

import java.util.Scanner;

public class ValidTriangle {

    public static boolean isTriangleValid(double a ,double b, double c){
        if (a+b >c && b+c >a && a+c>b){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        System.out.println(isTriangleValid(a,b,c));


    }
}


/*
  bool is not 
    boolean is there 

 */