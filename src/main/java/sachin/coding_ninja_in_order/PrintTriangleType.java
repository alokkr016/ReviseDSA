package sachin.coding_ninja_in_order;

import java.util.Scanner;

public class PrintTriangleType {

    public static boolean isTriangleValid(double a ,double b, double c){
        if (a+b >c && b+c >a && a+c>b){
            return true;
        }
        return false;
    }
    
    public static String sideType(int a ,int b, int c){

        if (!isTriangleValid(a, b, c)){
            return "NotATriangle";
        }

        if( a== b && b== c){
            return "Equilateral";
        }
        if (a!=b && b!=c && c!=a){
            return "Scalen";
        } 
        return "Isocles";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int a =input.nextInt();
        int b =input.nextInt();
        int c =input.nextInt();

        System.out.println(sideType(a, b, c));
    }
}
