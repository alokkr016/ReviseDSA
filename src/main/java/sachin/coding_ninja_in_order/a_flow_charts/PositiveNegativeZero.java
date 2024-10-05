package sachin.coding_ninja_in_order.a_flow_charts;

import java.util.Scanner;

public class PositiveNegativeZero {
    

    public static int positiveOrNegativeOrZero(int a){
        if (a == 0){
            return 0;
        }else if (a>0){
            return 1;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        System.out.println(positiveOrNegativeOrZero(num));
    }

}
