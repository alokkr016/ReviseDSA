package sachin.coding_ninja_in_order.a_flow_charts;

import java.util.Scanner;

public class Lcm {
    

    public static int lcm(int a ,int b){
        for(int i= Math.max(a, b); i<=a*b;i++){
            if (i%a==0&& i%b==0 ){
                return i;
            }
        }
        return -1; 
    }

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();


        System.out.println(lcm(num1,num2));
    }
}
