package sachin.coding_ninja_in_order;

import java.util.Scanner;

public class Factorial {
    
    public static int factorial(int num){
        int p =1;
        for(int i = 1 ; i<= num;i++){
            p*= i;
        }
        return p;
    }


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        System.out.println(factorial(num));
    }
}
