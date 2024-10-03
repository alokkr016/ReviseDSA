package alok.maths;

public class FactorialAprecend {
    public static int factorial(int n,int k){
        int result = 1;
        for (int i =1 ; i <= n; i++) {
            result  = (result * i ) % k ;
        }

        return result;
    }


    public static void main(String[] args) {
        int n = 56;
        int k = 97;
        System.out.println(factorial(n,k));
    }
}
