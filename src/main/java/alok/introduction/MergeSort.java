package alok.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>(){
           {
               add(1);
               add(2);
           }
       };
        int arr[] = {3,29,1,5,10};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        if(arr.length > 1){
            int mid = arr.length / 2;
            int left[] = new int[mid];
            int right[] = new int[arr.length - mid];
            int k = 0;

            for (int i = 0; i < mid; i++) {
                left[i] = arr[k++];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = arr[k++];
            }

            mergeSort(left);
            mergeSort(right);
            mergeSortedArray(left,right,arr);

        }
    }

    private static void mergeSortedArray(int[] left, int[] right, int[] result) {

        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize){
            if(left[i] < right[j]){
                result[k++] = left[i++];
            }else{
                result[k++] = right[j++];
            }
        }

        while (i < leftSize){
            result[k++] = left[i++];
        }

        while (j < rightSize){
            result[k++] = right[j++];
        }
    }


}
