package sachin.coding_ninja_in_order.c_conditional_and_loops;

import java.util.Scanner;

public class PatternTwo {

    
    public static void printPattern(int n){
        int num =1;
        for(int i =1 ;i<=n;i++){
            for(int j =1;j<=i-j-1;j++){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printPattern(n);
    }
}
