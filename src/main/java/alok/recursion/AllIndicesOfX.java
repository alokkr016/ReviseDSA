package alok.recursion;

import java.util.Arrays;

public class AllIndicesOfX {
    public static int[] allIndexes(int input[], int x) {
        return allIndexesHelper(input,x,0);
    }

    private static int[] allIndexesHelper(int[] input, int x, int index) {
        if(input.length == index){
            return new int[]{};
        }

        int result[] = allIndexesHelper(input,x,index + 1);
        if(input[index] == x){
            int newResult[] = new int[result.length + 1];
            newResult[0] = index;
            for (int i = 0; i < result.length; i++) {
                newResult[i + 1] = result[i];
            }
            return newResult;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]= {9, 8, 10, 8, 8};
        int x = 8;
        System.out.println(Arrays.toString(allIndexes(arr, x)));
    }
}
