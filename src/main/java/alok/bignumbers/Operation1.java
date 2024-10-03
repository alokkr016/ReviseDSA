package alok.bignumbers;

import java.util.Arrays;

public class Operation1 {
    public static int[] sumTwoNumbers(String str1, String str2) {
        int arr1[] = new int[str1.length()];
        int arr2[] = new int[str2.length()];

        for (int i = 0; i < str1.length(); i++) {
            arr1[i] = str1.charAt(i) - '0';
        }

        for (int i = 0; i < str2.length(); i++) {
            arr2[i] = str2.charAt(i) - '0';
        }

        int result[] = new int[arr1.length > arr2.length ? arr1.length : arr2.length + 1];
        int k = arr2.length - 1;
        int l = result.length - 1;
        int carry = 0;
        int sum = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        while (i >= 0 && j >= 0) {
            sum = arr1[i] + arr2[k] + carry;
            result[l] = (sum % 10);
            carry = sum / 10;
            i--;
            j--;
            l--;
        }

        while (i >= 0) {
            sum = arr1[i] + carry;
            result[l] = (sum % 10);
            carry = sum / 10;
            i--;
            l--;
        }

        while (j >= 0) {
            sum = arr1[j] + carry;
            result[l] = (sum % 10);
            carry = sum / 10;
            j--;
            l--;
        }
        if (carry > 0) {
            if(i > 0){
                result[0] =arr1[i] + carry;
                i--;
            }else{
                result[0] =arr2[j] + carry;
            }


        }
        return result;
    }


    public static int countOfDigit(int n) {
        if (n == 0) {
            return 0;
        }

        return 1 + countOfDigit(n / 10);
    }

    public static void main(String[] args) {
        String str = "9999";
        String str2 = "222";
        System.out.println(Arrays.toString(sumTwoNumbers(str, str2)));

    }
}
