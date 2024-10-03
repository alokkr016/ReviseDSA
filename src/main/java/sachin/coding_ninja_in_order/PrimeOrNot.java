package sachin.coding_ninja_in_order;

import java.util.Scanner;

public class PrimeOrNot {


    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        if (n== 2){
            return true;
        }
        for (int i = 2; i * i< n ;i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        
        System.out.println(isPrime(n));
    }
    
}