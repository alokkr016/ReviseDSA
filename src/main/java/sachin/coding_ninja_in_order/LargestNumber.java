package sachin.coding_ninja_in_order;

import java.util.Scanner;

public class LargestNumber {
    

    public static int largestOfTwoNumbers(int a ,int b){
        if (a>= b){
            return a;
        }
        return b;
    }

    public static int largestOfNNumbers(int arr []){
        int ans = Integer.MIN_VALUE;
        for (int i =0 ;i< arr.length; i++ ){
            ans = largestOfTwoNumbers(ans,arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner input  = new Scanner(System.in);
        int size = input.nextInt();

        int arr [] =new int[size];

        for(int i = 0 ;i<size;i++){
            arr[i] = input.nextInt();
        }

        System.out.println(largestOfNNumbers(arr));

    }
}


// learned how to take array input