package alok.introduction;

import java.util.Scanner;

public class CheckPrime {
    public static boolean checkPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(checkPrime(n)){
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }
    }
}
