package sachin.coding_ninja_in_order;

import java.util.Scanner;

public class PrintTriangleTypeAngleBased {

    public static boolean isTriangleValid(double a ,double b, double c){
        if (a+b >c && b+c >a && a+c>b){
            return true;
        }
        return false;
    }
    
    public static int  returnMax(int a, int b){
        if (a>=b){
            return a;
        }
        return b;
    }
    public static String angleBasedType(int a ,int b ,int c){
        if (!isTriangleValid(a,b,c)){
            return "NotATriangle";
        }
        int maxValue = returnMax(returnMax(a, b),c);
        int b2p2 = 0;
        if (maxValue == a){
            b2p2 = b*b +c*c;
        }else if (maxValue == b){
            b2p2 = a*a +c*c;
        }else{
            b2p2 = b*b +a*a;
        }
        if (maxValue *maxValue == b2p2){
            return "RightAngled";
        }else if (maxValue *maxValue > b2p2){
            return "ObtuseAngled";
        }
        return "AcuteAngled";
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        int a =input.nextInt();
        int b =input.nextInt();
        int c =input.nextInt();

        System.out.println(angleBasedType(a, b, c));
    }
}
