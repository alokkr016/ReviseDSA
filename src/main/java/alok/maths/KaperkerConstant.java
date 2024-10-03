package alok.maths;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class KaperkerConstant {
    public static int reverse (int n){
        int reversed = 0;
        int remainder = 0;
        while (n > 0){
            remainder = n % 10;
            reversed = reversed  * 10 + remainder;
            n /= 10;
        }
       return reversed;
    }

    public static  int ArrayOfCharToNumberIncreasing(char []arr){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num += (arr[i] - '0')  * Math.pow(10, arr.length - 1 - i);
        }
        return num;
    }

    public static  int ArrayOfCharToNumberDecreasing(char []arr){
        int num = 0;
        for (int i = arr.length - 1;  i >= 0; i--) {
            num += (arr[i] - '0')  * Math.pow(10,i);
        }
        return num;
    }



    public static void main(String[] args) {
        String str = "12345";
        char arr[] = str.toCharArray();
        int num = 0;
        int count = 1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (   max != min){
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            min = ArrayOfCharToNumberIncreasing(arr);
            max = ArrayOfCharToNumberDecreasing(arr);
            num = max - min;

            System.out.println(max + " " + min);
            arr =(num + "").toCharArray();
            count++;
        }

        System.out.println("count " + count);
    }
}
