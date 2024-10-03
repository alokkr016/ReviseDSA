package alok.dp;

import java.util.Arrays;

public class MinStepToOne {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(minStepTwoOneMemoization(n));
        System.out.println(minStepTwoOne(n));
    }

    private static int minStepTwoOne(int n) {
        int arr[] = new int[n + 1];
        Arrays.fill(arr,-1);
        arr[1] = 0;

        for (int i = 2; i < n + 1; i++) {
            int dividedBy2 = Integer.MAX_VALUE;
            if(i % 2 == 0){
                dividedBy2 = arr[i / 2];
            }
            int dividedBy3 = Integer.MAX_VALUE;
            if(i % 3 == 0){
                dividedBy3 = arr[i / 3];
            }

            if(arr[i] == -1){
                arr[i] = 1 + Integer.min(arr[i - 1],Integer.min(dividedBy2,dividedBy3));
            }
        }
        return arr[n];
    }

    private static int minStepTwoOneMemoization(int n) {

        int arr[] = new int[n + 1];
        Arrays.fill(arr, -1);
        int ans =  minStepTwoOne(arr, n);
        return ans;
    }

    private static int minStepTwoOne(int[] arr, int n) {
        if(n == 1){
            arr[n] = 0;
            return 0;
        }

        if (arr[n] == -1) {
            int dividedBy2 = Integer.MAX_VALUE;
            if (n % 2 == 0) {
                dividedBy2 = minStepTwoOne(n / 2);
            }

            int dividedBy3 = Integer.MAX_VALUE;
            if (n % 3 == 0) {
                dividedBy3 = minStepTwoOne(n / 3);
            }
            arr[n] = 1 + Integer.min(minStepTwoOne(arr, n - 1), Integer.min(dividedBy2, dividedBy3));
        } else {
            arr[n] = 1 + Integer.min(arr[n - 1], Integer.min(arr[n - 2], arr[n - 3]));
        }

        return arr[n];
    }
}
