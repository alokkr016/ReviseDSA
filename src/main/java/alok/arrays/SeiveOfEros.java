package alok.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SeiveOfEros {
    public static void main(String[] args) {
        int size = 100;
        int arr[] = new int[size];
        Arrays.fill(arr,1);
        arr[0] = 0;
        arr[1] = 0;

        for (int i = 2; i <= size; i++) {
            for (int j = i * i; j < size; j += i) {
                arr[j] = 0;
            }
        }

        for (int i = 0; i < size; i++) {
            if(arr[i] == 1){
                System.out.print(i + " ");
            }
        }

    }

}

