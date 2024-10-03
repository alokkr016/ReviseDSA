package sachin.coding_ninja_in_order;

import java.util.Scanner;

public class EvenNumberPrint {
    
    public static void printEven(int num){
        for (int i=1 ;i<=num ;i++){
            if (i%2 ==0){ 
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        printEven(num);
    }

}

/*
 println -> attach new line by itself
print -> will not attach
 */

