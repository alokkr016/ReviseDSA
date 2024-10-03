package alok.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadUpdate {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 5, 8, 20};
        int matrix[][] = {
                {0, 2, 3},
                {1, 3, 5},
                {0, 4, 6},
                {1, 6, 4}
        };

        moreReadQuery(arr,matrix);
    }

    private static void moreReadQuery(int[] arr, int[][] matrix) {
       int cumulativeSum[] = new int[arr.length];
        cumulativeSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            cumulativeSum[i] = arr[i] + cumulativeSum[i - 1];
        }

        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == 0){
                int index = matrix[i][1];
                int value = matrix[i][2];

                int diff = arr[index] - value;
                for (int j = index; j < cumulativeSum.length; j++) {
                    cumulativeSum[index] -= diff;
                }
                System.out.println(Arrays.toString(cumulativeSum));
                System.out.println("query updated index "+ index  + " value " + value );
            }else{
                int startIndex = matrix[i][1];
                int endIndex = matrix[i][2];
                System.out.println(cumulativeSum[endIndex] + " " + cumulativeSum[startIndex - 1]);
                System.out.println("sum " + (cumulativeSum[endIndex] - cumulativeSum[startIndex - 1]));
            }

        }
    }
}

