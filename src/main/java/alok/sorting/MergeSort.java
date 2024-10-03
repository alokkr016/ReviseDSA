package alok.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int left[] = new int[mid];
            int right[] = new int[arr.length - mid];

            for (int i = 0; i < left.length; i++) {
                left[i] = arr[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = arr[mid + i];
            }
            merge(left);
            merge(right);
            mergeTwoSortedArray(arr, left, right);
        }
    }


    public static void mergeTwoSortedArray(int[] result, int left[], int right[]) {
        int leftSize = left.length;
        int rightSize = right.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            result[k] = left[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            result[k] = right[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int arr[] = {4, 6, 2,11 ,10,5,101};
        merge(arr);
        System.out.println(Arrays.toString(arr));

    }
}
