package alok.builtin;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortByWord {
    public static void sortBySum(int[][] arr) {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (sum(o1) < sum(o2)) {
                    return -1;
                } else if (sum(o1) > sum(o2)) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public static int sum(int arr[]) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }


    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {0, 1, 4},
                {4, 5, 6},
                {0, 0, 0}};

        sortBySum(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

//        Arrays.sort(arr,new Comparator<>(){
//            @Override
//            public int compare(String o1, String o2) {
//                if(o1.length() < o2.length()){
//                    return -1;
//                } else if (o1.length() > o2.length() ) {
//                    return 1;
//                }else {
//                    return 0;
//                }
//            }
//        });
//
//        System.out.println(Arrays.toString(arr));
    }
}
