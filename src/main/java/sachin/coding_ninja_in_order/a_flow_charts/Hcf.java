package sachin.coding_ninja_in_order.a_flow_charts;

import java.util.Scanner;

public class Hcf {
    

    public static int hcf(int a ,int b){
        for(int i= Math.min(a,b) ;i >= 1 ;i--){
            if (a%i==0 &&b%i==0){
                return i;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();


        System.out.println(hcf(num1,num2));
    }

}

/*
    Math.min
 */
